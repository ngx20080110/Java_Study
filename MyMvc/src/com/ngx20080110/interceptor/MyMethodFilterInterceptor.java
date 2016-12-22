package com.ngx20080110.interceptor;

import java.util.Date;

import com.ngx20080110.action.ch4.LoginAction48;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MyMethodFilterInterceptor extends MethodFilterInterceptor {
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		LoginAction48 action = (LoginAction48)invocation.getAction();
		System.out.println(name + " interceptor action ----begin action at " + (new Date()));
		long start = System.currentTimeMillis();
		String result = invocation.invoke();
		System.out.println(name + " interceptor action ----end action at " + (new Date()));
		long end = System.currentTimeMillis();
		System.out.println(name + " interceptor action ----cost " + (end - start) + "ms");
		return result;
	}
}
