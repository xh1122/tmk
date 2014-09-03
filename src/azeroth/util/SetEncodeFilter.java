package azeroth.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SetEncodeFilter implements Filter {
	protected FilterConfig filterConfig = null;
	protected String defaultEncoding = null;

	public void init(FilterConfig arg0) throws ServletException {
		this.filterConfig = arg0;
		this.defaultEncoding = filterConfig.getInitParameter("defaultencoding");
	}

	public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(selectEncoding(request));
		chain.doFilter(request, response);
	}

	public void destroy() {
		this.defaultEncoding = null;
		this.filterConfig = null;
	}

	protected String selectEncoding(ServletRequest request) {
		return this.defaultEncoding;
	}
}
