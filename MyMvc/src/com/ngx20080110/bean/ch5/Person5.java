package com.ngx20080110.bean.ch5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Person5 {
	private Integer id;
	private String name;
	private int age;
	private SortedSet<String> trainings = new TreeSet<String>();
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
	public SortedSet<String> getTrainings() {
		return trainings;
	}
	public void setTrainings(SortedSet<String> trainings) {
		this.trainings = trainings;
	}
	
}
