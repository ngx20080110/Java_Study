<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	局部類型轉換器
	<s:form action="login43">
		<s:textfield name="user" label="user" />
		<tr>
		<td colspan="2">
		<s:submit value="Convert" theme="simple" />
		<s:reset value="Reset" theme="simple" />
		</td>
		</tr>
	</s:form>
	<br />
	<s:debug />
</body>
</html>