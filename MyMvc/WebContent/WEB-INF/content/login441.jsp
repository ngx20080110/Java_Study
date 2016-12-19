<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>下載前的登錄頁面</title>
<s:head/>
</head>
<body>
	<br />
	<h2>下載前的登錄頁面</h2>
	<s:form action="login441">
		<s:textfield name="name" label="用戶名" />
		<s:textfield name="pass" label="密碼" />
		<tr><td colspan="2">
		<s:submit value="登錄" />
		</td></tr>
	</s:form>
	<br />
	<s:debug />
</body>
</html>