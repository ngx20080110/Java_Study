package com.ngx20080110.action.ch4;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.ngx20080110.bean.User;

public class UserConverter44 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		User user = new User();
		String[] userValues = values[0].split(",");
		user.setName(userValues[0]);
		user.setPass(userValues[1]);
		
		return user;
	}

	@Override
	public String convertToString(Map context, Object o) {
		User user = (User)o;
		return user.toString();
	}

}
