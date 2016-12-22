package com.ngx20080110.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MyPreResultListener implements PreResultListener {
	@Override
	public void beforeResult(ActionInvocation invocation, String resultCode) {
		System.out.println("Return logic view is " + resultCode);
	}
}
