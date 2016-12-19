package com.ngx20080110.action.ch4;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	private String inputPath;

	public String getInputPath() {
		return inputPath;
	}

	public void setInputPath(String inputPath) {
		this.inputPath = inputPath;
	}
	
	public InputStream getTargetFile() throws Exception {
		return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
	}
}
