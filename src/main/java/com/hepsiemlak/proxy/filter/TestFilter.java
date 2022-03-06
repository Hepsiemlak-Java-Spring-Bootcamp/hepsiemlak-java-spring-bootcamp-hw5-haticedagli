package com.hepsiemlak.proxy.filter;


import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


@Component
@Order(1)
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        HttpServletRequest req = (HttpServletRequest) request;

        System.out.println(
                "Starting a transaction for req : " +
                req.getRequestURI());

        filterChain.doFilter(request, response);

        System.out.println(
                "Committing a transaction for req : " +
                req.getRequestURI());

    }
}
