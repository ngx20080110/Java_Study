package com.ngx20080110.action.ch4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class Upload433Action extends ActionSupport {
	private String title;
	private File upload;
	private String uploadContentType;
	private String uploadFileName;
	private String savePath;
	private String savePathWeb;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}
	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getSavePath() {
		return ServletActionContext.getServletContext().getRealPath("/WEB-INF" + savePath);
	}
	public void setSavePath(String savePath) {
		this.savePath = savePath;
	}
	public String getSavePathWeb() {
		return "/WEB-INF" + savePath;
	}
	public void setSavePathWeb(String savePathWeb) {
		this.savePathWeb = savePathWeb;
	}
	@Override
	public String execute() throws Exception {
		File uploadDir = new File(getSavePath());
		System.out.println("uploadDir=" + uploadDir);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		FileOutputStream fos = new FileOutputStream(getSavePath() + "\\" + getUploadFileName());
		FileInputStream fis = new FileInputStream(getUpload());
		byte[] buffer = new byte[2048];
		int len = 0;
		while ((len = fis.read(buffer)) > 0) {
			fos.write(buffer, 0, len);
		}
		fis.close();
		fos.close();
		return SUCCESS;
	}
}
