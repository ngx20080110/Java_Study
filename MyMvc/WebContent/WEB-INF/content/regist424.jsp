<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>請輸入您的注冊信息</title>
<s:head/>
</head>
<body>
	<br />
	<h2>請輸入您的注冊信息</h2>
	<s:form action="regist424Pro">
		<s:textfield name="user.name" label="用戶名" />
		<s:textfield name="user.pass" label="密碼" />
		<s:textfield name="user.age" label="年齡" />
		<s:textfield name="user.birth" label="生日" />
		<s:submit value="注冊" />
	</s:form>
	<br />
	<s:debug />
</body>
</html>