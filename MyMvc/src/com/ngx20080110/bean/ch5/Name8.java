package com.ngx20080110.bean.ch5;

import java.util.HashMap;
import java.util.Map;

public class Name8 {
	private String first;
	private String last;
	private Person7 owner;
	private Map<String, Integer> power = new HashMap<String, Integer>();
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public Person7 getOwner() {
		return owner;
	}
	public void setOwner(Person7 owner) {
		this.owner = owner;
	}
	public Map<String, Integer> getPower() {
		return power;
	}
	public void setPower(Map<String, Integer> power) {
		this.power = power;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Name8.class) {
			Name8 target = (Name8)obj;
			if (target.getFirst().equals(getFirst()) && target.getLast().equals(getLast())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return getFirst().hashCode() * 13 + getLast().hashCode();
	}
}
