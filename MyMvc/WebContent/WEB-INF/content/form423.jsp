<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>請輸入您的用戶信息</title>
<s:head/>
</head>
<body>
	<br />
	<h2>請輸入您的用戶信息</h2>
	<s:form action="loginPro">
		<s:textfield name="name" label="用戶名" />
		<s:textfield name="pass" label="密碼" />
		<s:textfield name="age" label="年齡" />
		<s:textfield name="birth" label="生日" />
		<tr><td colspan="2">
		<s:submit value="注冊" theme="simple" onclick="this.form.action='registPro';" />
		<s:submit value="登錄" theme="simple" onclick="this.form.action='loginPro';" />
		</td></tr>
	</s:form>
	<br />
	<s:debug />
</body>
</html>