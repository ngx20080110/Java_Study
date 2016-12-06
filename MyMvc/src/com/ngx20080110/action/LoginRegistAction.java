package com.ngx20080110.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class LoginRegistAction extends ActionSupport {

	public String regist() throws Exception {
		ActionContext.getContext().getSession().put("user", getUsername());
		return SUCCESS;
	}
	
	public String execute() throws Exception {
		ActionInvocation invocation = ActionContext.getContext().getActionInvocation();
		invocation.addPreResultListener(new PreResultListener() {
			
			@Override
			public void beforeResult(ActionInvocation actionInvocation, String resultCode) {
				System.out.println("Return code = " + resultCode);
				actionInvocation.getInvocationContext().put("extra", new java.util.Date() + " from " + resultCode);
			}
		});
		if (getUsername().equals("wugy") && getPassword().equals("wugy")) {
			ActionContext.getContext().getSession().put("user", getUsername());
			setTip("Welcome, " + getUsername());
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}
	
	private String username;
	private String password;
	private String tip;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
}
