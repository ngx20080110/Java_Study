package com.ngx20080110.action.ch4;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.struts2.util.StrutsTypeConverter;

import com.ngx20080110.bean.User;

public class UserConverter45 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map context, String[] values, Class toClass) {
		Set result = new HashSet();
		for (int i = 0; i < values.length; i++) {
			User user = new User();
			String[] userValues = values[i].split(",");
			user.setName(userValues[0]);
			user.setPass(userValues[1]);
			result.add(user);
		}
		return result;
	}

	@Override
	public String convertToString(Map context, Object o) {
		if (o.getClass() == Set.class) {
			Set users = (Set)o;
			String result = "{";
			for (Object obj : users) {
				User user = (User)obj;
				result += user.toString();
			}
			return result + "}";
		}
		else {
			return "";
		}
	}

}
