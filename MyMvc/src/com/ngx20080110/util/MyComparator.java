package com.ngx20080110.util;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		return o1.toString().length() - o2.toString().length();
	}

}
