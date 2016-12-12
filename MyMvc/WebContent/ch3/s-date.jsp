<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Date</title>
</head>
<body>
	<br />
	<s:bean name="java.util.Date" var="now" />
	nice=false, format=dd/MM/yyyy<br />
	<s:date name="#now" format="dd/MM/yyyy" nice="false"/><hr />
	
	nice=true, format=dd/MM/yyyy<br />
	<s:date name="#now" format="dd/MMyyyy" nice="true"/><hr />
	
	nice=true<br />
	<s:date name="#now" nice="true"/><hr />
	
	nice=false<br />
	<s:date name="#now" nice="false"/><hr />
	
	nice=false, no format, have var<br />
	<s:date name="#now" nice="false" var="abc"/><hr />
	${requestScope.abc}
	<s:property value="#abc" />
	<br />
	<br />
	<s:debug />
</body>
</html>