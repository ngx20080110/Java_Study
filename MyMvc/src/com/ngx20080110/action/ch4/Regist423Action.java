package com.ngx20080110.action.ch4;

import java.util.Date;

public class Regist423Action extends Base423Action {
	public String regist() {
		return SUCCESS;
	}
	public String login() {
		return SUCCESS;
	}
	private String pass;
	private int age;
	private Date birth;
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
