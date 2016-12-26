package com.ngx20080110.bean.ch5;

import java.util.HashMap;
import java.util.Map;

public class Person7 {
	private Integer id;
	private int age;
	private Map<String, Name7> nicks = new HashMap<String, Name7>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Name7> getNicks() {
		return nicks;
	}
	public void setNicks(Map<String, Name7> nicks) {
		this.nicks = nicks;
	}
	
}
