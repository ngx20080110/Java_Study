package com.ngx20080110.bean.ch5;

import java.util.HashMap;
import java.util.Map;

public class Person8 {
	private Integer id;
	private int age;
	private Map<Name8, Integer> nickPower = new HashMap<Name8, Integer>();
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
	public Map<Name8, Integer> getNickPower() {
		return nickPower;
	}
	public void setNickPower(Map<Name8, Integer> nickPower) {
		this.nickPower = nickPower;
	}
}
