<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:token tag</title>
</head>
<body>
	<br />
	Use s:token to prevent duplicate submit
	<s:form action="pro">
		<s:textfield name="book" key="book"></s:textfield>
		<s:token></s:token>
		<s:submit value="Submit" />
	</s:form>
	<br />
	<br />
	<s:debug />
</body>