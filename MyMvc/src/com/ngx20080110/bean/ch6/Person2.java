package com.ngx20080110.bean.ch6;

import java.util.HashSet;
import java.util.Set;

public class Person2 {
	private Integer id;
	private String name;
	private int age;
	private Set<Address1> addresses = new HashSet<Address1>();
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
	public Set<Address1> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<Address1> addresses) {
		this.addresses = addresses;
	}
}
