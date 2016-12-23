package com.ngx20080110.bean.ch5;

import java.util.HashSet;
import java.util.Set;

public class Person3 {
	private Integer id;
	private String name;
	private int age;
	private Set<String> schools = new HashSet<String>();
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Set<String> getSchools() {
		return schools;
	}
	public void setSchools(Set<String> schools) {
		this.schools = schools;
	}
}
