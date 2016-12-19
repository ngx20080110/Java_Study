<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>上傳成功</title>
</head>
<body>
	<br />
	<h2>上傳成功！</h2>
	文件標題：<s:property value="title" /><br />
	文件爲：<img src="<s:property value="'uploadFiles/' + uploadFileName"/>"/><br/>
</body>
</html>