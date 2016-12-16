package com.ngx20080110.action;

import com.opensymphony.xwork2.ActionSupport;

public class DemoAction extends ActionSupport {

	public String execute() {
		addActionError("First error message");
		addActionError("Second error message");
		addActionMessage("First common message");
		addActionMessage("Second common message");
		return SUCCESS;
	}
}
