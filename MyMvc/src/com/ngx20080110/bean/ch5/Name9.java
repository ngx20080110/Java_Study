package com.ngx20080110.bean.ch5;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Name9 implements Serializable {
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
		if (obj != null && obj.getClass() == Name9.class) {
			Name9 target = (Name9)obj;
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
