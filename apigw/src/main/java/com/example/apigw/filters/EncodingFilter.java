package com.example.apigw.filters;

import com.example.apigw.EncodingWrapper;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class EncodingFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println("EncodingFilter:" +request.getContextPath());


        String plainQuery = request.getQueryString();
        try {
            String encodedQuery = plainQuery.replace("+" , URLEncoder.encode("+", StandardCharsets.UTF_8.toString()));
            EncodingWrapper wrappedRequest = new EncodingWrapper(request,encodedQuery);
            ctx.setRequest(wrappedRequest);

        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
