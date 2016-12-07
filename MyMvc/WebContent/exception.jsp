<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="exceptionPage" /></title>
</head>
<body>
	異常信息: <s:property value="exception.message" />
	<br />
	<s:property value="exceptionStack" />
</body>
</html>