package com.ngx20080110.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class BeforeResultInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		invocation.addPreResultListener(new MyPreResultListener());
		System.out.println("execute before ...");
		String result = invocation.invoke();
		System.out.println("execute after ...");
		return result;
	}
}
