/**
 * 
 */
package com.bplan.springcloud.provider.web.filter;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * filterOrder：过滤的顺序
 * shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 * run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下： 
 *     pre：路由之前
 *     routing：路由之时 
 *     post： 路由之后 
 *     error：发送错误调用
 */
@Component
public class myFilter extends ZuulFilter {
	
	private static Logger logger = LoggerFactory.getLogger(myFilter.class);

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		logger.info(String.format("%s ===> %s", request.getMethod(), request.getRequestURL().toString()));
		String token = request.getParameter("token");
		if (StringUtils.isBlank(token)) {
			logger.warn("===== token is null =====");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(HttpStatus.UNAUTHORIZED.value());
			try {
				ctx.getResponse().getWriter().write("==== token is null ====");
			} catch (Exception e) {
				e.printStackTrace();
			}

			return null;
		}
		logger.info("ok");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}
}
