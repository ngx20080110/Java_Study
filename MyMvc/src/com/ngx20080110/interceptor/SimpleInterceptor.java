package com.ngx20080110.interceptor;

import java.util.Date;

import com.ngx20080110.action.ch4.LoginAction47;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class SimpleInterceptor extends AbstractInterceptor {

	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		LoginAction47 action = (LoginAction47)invocation.getAction();
		System.out.println(name + " interceptor action ----begin action at " + (new Date()));
		long start = System.currentTimeMillis();
		String result = invocation.invoke();
		System.out.println(name + " interceptor action ----end action at " + (new Date()));
		long end = System.currentTimeMillis();
		System.out.println(name + " interceptor action ----cost " + (end - start) + "ms");
		return result;
	}

}
