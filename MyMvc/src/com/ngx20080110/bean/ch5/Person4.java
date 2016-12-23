package com.ngx20080110.bean.ch5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Person4 {
	private Integer id;
	private String name;
	private int age;
	private Map<String, Float> scores = new HashMap<String, Float>();
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
	public Map<String, Float> getScores() {
		return scores;
	}
	public void setScores(Map<String, Float> scores) {
		this.scores = scores;
	}
	
}
