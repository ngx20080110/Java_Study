package com.ngx20080110.action.ch4;

import java.util.List;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction42 extends ActionSupport {
	public String execute() throws Exception {
		System.out.println(getUsers());
		User firstUser = (User)getUsers().get(0);
		if (firstUser.getName().equals("wugy") && firstUser.getPass().equals("wugy")) {
			setTip("Success");
			return SUCCESS;
		}
		else {
			setTip("Fail");
			return ERROR;
		}
	}
	private List users;
	private String tip;
	public List getUsers() {
		return users;
	}
	public void setUsers(List users) {
		this.users = users;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
}
