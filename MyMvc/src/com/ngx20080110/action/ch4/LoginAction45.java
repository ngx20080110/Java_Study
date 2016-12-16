package com.ngx20080110.action.ch4;

import java.util.Date;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction45 extends ActionSupport {
	private Set users;
	private Date birth;
	public Set getUsers() {
		return users;
	}
	public void setUsers(Set users) {
		this.users = users;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
