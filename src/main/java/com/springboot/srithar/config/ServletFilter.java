package com.springboot.srithar.config;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;

@Component
public class ServletFilter implements Filter {

	@Override
	@SuppressWarnings("unused")
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpReponse = (HttpServletResponse) response;
        Enumeration<String> headerNames = httpRequest.getHeaderNames();
        headerNames.asIterator().forEachRemaining(a->{
        	//System.out.println(a+ " --> " + httpRequest.getHeader(a));
        });
		chain.doFilter(request, response);
	}

}
