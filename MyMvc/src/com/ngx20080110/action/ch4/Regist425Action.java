package com.ngx20080110.action.ch4;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.DateRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RegexFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Regist425Action extends ActionSupport {
	private String name;
	private String pass;
	private int age;
	private Date birth;
	public String getName() {
		return name;
	}
	@RequiredStringValidator(key="name.required")
	@RegexFieldValidator(regex="\\w{4,25}", key="name.regex")
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	@RequiredStringValidator(key="pass.required")
	@RegexFieldValidator(regex="\\w{4,25}", key="pass.regex")
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	@IntRangeFieldValidator(key="age.range", min="1", max="160")
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	@DateRangeFieldValidator(key="birth.range", min="1900/01/01", max="2060/01/21")
	public void setBirth(Date birth) {
		this.birth = birth;
	}
}
