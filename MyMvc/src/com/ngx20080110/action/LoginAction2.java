package com.ngx20080110.action;

import com.opensymphony.xwork2.ActionContext;

public class LoginAction2 {
	public String doLogin() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		Integer counter = (Integer)ctx.getApplication().get("counter");
		if (counter == null) {
			counter = 1;
		}
		else {
			counter++;
		}
		ctx.getApplication().put("counter", counter);
		ctx.getSession().put("user", getUsername());
		if ("wugy".equals(getUsername()) && "wugy".equals(getPassword())) {
			ActionContext.getContext().getSession().put("user", getUsername());
			setTips("Hello Tips");
			return "success";
		}
		else {
			return "error";
		}
	}
	
	private String username;
	private String password;
	private String tips;
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
	public void setTips(String tips) {
		this.tips = tips;
	}
	public String getTips() {
		return tips;
	}
	@Override
	public String toString() {
		return "LoginAction [username=" + username + ", password=" + password + "]";
	}
}
