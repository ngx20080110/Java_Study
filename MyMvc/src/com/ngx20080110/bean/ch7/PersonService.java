package com.ngx20080110.bean.ch7;

public class PersonService {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void info() {
		System.out.println("The name is " + name);
	}
}
