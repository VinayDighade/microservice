package com.example.apigw;

import com.netflix.zuul.http.HttpServletRequestWrapper;

import javax.servlet.http.HttpServletRequest;

public class EncodingWrapper extends HttpServletRequestWrapper {

    public String queryParamsString;
    public EncodingWrapper(HttpServletRequest request,String queryParams) {
        super(request);
        this.queryParamsString = queryParams;
    }


    @Override
    public String getQueryString(){
        return queryParamsString;
    }
}
