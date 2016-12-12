package com.ngx20080110.util;

import org.apache.struts2.util.SubsetIteratorFilter;

public class MyDecider implements SubsetIteratorFilter.Decider {

	@Override
	public boolean decide(Object element) throws Exception {
		String str = element.toString();
		System.out.println("str=" + str);
		
		return str.indexOf("C") > -1;
	}
}
