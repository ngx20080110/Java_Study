package com.ngx20080110.action.ch4;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	private String filename;
	private String downloadDir;
	
	public String getFilename() {
		return filename;
	}


	public void setFilename(String filename) {
		this.filename = filename;
	}


	public String getDownloadDir() {
		return downloadDir;
	}


	public void setDownloadDir(String downloadDir) {
		this.downloadDir = downloadDir;
	}


	public InputStream getTargetFile() throws Exception {
		System.out.println("getTargetFile is called -> filename=" + filename);
		String realPath=downloadDir + filename;
		   InputStream in=ServletActionContext.getServletContext().getResourceAsStream(realPath);
		   if(null==in){
		    System.out.println("Can not find a Java.io.InputStream with the name [inputStream] in the invocation stack. Check the <param name=\"inputName\"> tag specified for this action.");   
		   }
		return ServletActionContext.getServletContext().getResourceAsStream(realPath);
	}
}
