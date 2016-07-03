package com.executor.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.executor.constants.ConstantsUtil;

public class SessionFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession httpSession = httpRequest.getSession();
		if (!passFilter(httpRequest.getRequestURI())
				&& !ConstantsUtil.SESSION_LOGIN_YES.equals(httpSession.getAttribute(ConstantsUtil.SESSION_LOGIN))) {
			httpSession.setAttribute(ConstantsUtil.SESSION_LOGIN, ConstantsUtil.SESSION_LOGIN_NO);
			RequestDispatcher dispatcher = request.getRequestDispatcher(ConstantsUtil.LOG_IN_JSP);
			dispatcher.forward(request, response);
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	private boolean passFilter(String uri) {
		if (ConstantsUtil.LOG_IN_URI.equals(uri) || uri.contains("Flat-UI-master")) {
			return true;
		}
		return false;
	}

}
