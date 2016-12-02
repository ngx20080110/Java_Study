package com.ngx20080110.action;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

public class LoginAction3 implements Action, ServletResponseAware {

	@Override
	public void setServletResponse(HttpServletResponse response) {
		resp = response;
	}

	@Override
	public String execute() throws Exception {
		if ("wugy".equals(getUsername()) && "wugy".equals(getPassword())) {
			ActionContext.getContext().getSession().put("user", getUsername());
			Cookie cookie = new Cookie("user", getUsername());
			cookie.setMaxAge(60 * 60);
			resp.addCookie(cookie);
			return SUCCESS;
		}
		else {
			return ERROR;
		}
	}

	private HttpServletResponse resp;
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
