<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>簡單的文件上傳</title>
<s:head/>
</head>
<body>
	<br />
	<s:form action="upload433" enctype="multipart/form-data">
		<s:textfield name="title" label="文件標題" /><br />
		<s:file name="upload" label="選擇文件" /><br />
		<s:submit value="上傳" />
	</s:form>
	<br />
	<s:debug />
</body>
</html>