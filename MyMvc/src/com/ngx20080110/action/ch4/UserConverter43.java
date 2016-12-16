package com.ngx20080110.action.ch4;

import java.util.Map;

import com.ngx20080110.bean.User;
import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class UserConverter43 extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value, Class toType) {
		System.out.println("convertValue");
		if (toType == User.class) {
			System.out.println("toType == User.class");
			System.out.println("value=" + value);
//			String[] params = (String[])value;
			System.out.println("debug1");
			User user = new User();
			System.out.println("debug2");
			String[] userValues = value.toString().split(",");
			System.out.println("debug3");
			user.setName(userValues[0]);
			System.out.println("debug4");
			user.setPass(userValues[1]);
			System.out.println(user);
			return user;
		}
		else if (toType == String.class) {
			System.out.println("toType == String.class");
			User user = (User)value;
			return "<" + user.getName() + "," + user.getPass() + ">";
		}
		return null;
	}
}
