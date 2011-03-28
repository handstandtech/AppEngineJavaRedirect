package com.handstandtech.redirect;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectFilter implements Filter {

	private String domain;

	/** Creates new SessionFilter */
	public RedirectFilter() {
	}

	public void init(FilterConfig filterConfig) throws ServletException {
		this.domain = filterConfig.getInitParameter("DOMAIN");
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws java.io.IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		String fullUrl = domain + request.getRequestURI();
		System.out.println("Redirecting to: " + fullUrl);
		response.sendRedirect(fullUrl);
		return;
	}

	@Override
	public void destroy() {

	}
}