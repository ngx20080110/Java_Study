<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Push tag</title>
</head>
<body>
	<br />
	<h2>Use s:push to put a value into value stack</h2>
	<s:bean name="com.ngx20080110.bean.Person" var="p1">
		<s:param name="name">wugy</s:param>
		<s:param name="age">30</s:param>
	</s:bean>
	<s:push value="#p1">
		Object in the top of value stack -> name=<s:property value="name" /><br />
		Object in the top of value stack -> age=<s:property value="age" />
	</s:push>
	<br />
	<br />
	<s:debug />
</body>
</html>