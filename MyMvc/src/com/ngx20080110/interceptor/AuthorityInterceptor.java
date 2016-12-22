package com.ngx20080110.interceptor;

import java.util.Map;
import java.util.ResourceBundle;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		Map<String, Object> session = ctx.getSession();
		String user = (String)session.get("user");
		if (user != null && user.equals("wugy")) {
			return invocation.invoke();
		}
		ResourceBundle bundle = ResourceBundle.getBundle("global");
		ctx.put("tip", bundle.getString("tip.login"));
		return Action.LOGIN;
	}
}
