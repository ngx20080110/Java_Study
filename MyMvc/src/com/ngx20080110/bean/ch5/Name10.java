package com.ngx20080110.bean.ch5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Embeddable;

@Embeddable
public class Name10 implements Serializable {
	private String first;
	private String last;
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj != null && obj.getClass() == Name10.class) {
			Name10 target = (Name10)obj;
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
