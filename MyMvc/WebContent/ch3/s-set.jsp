<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Push tag</title>
</head>
<body>
	<br />
	<h2>Use s:set to set a new variable</h2>
	<s:bean name="com.ngx20080110.bean.Person" var="p1">
		<s:param name="name">wugy</s:param>
		<s:param name="age">30</s:param>
	</s:bean>
	Put p1 of stack context into default scope (action)<br />
	<s:set value="#p1" var="xxx" />
	In stack context, xxx -> name = <s:property value="#xxx.name" /><br />
	In stack context, xxx -> age = <s:property value="#xxx.age" /><br />
	In request scope, xxx -> name = ${requestScope.xxx.name}<br />
	In request scope, xxx -> age = ${requestScope.xxx.age}<br />
	<hr />
	
	Put p1 of stack context into application scope<br />
	<s:set var="yyy" value="#p1" scope="application" />
	In application scope, yyy -> name = ${applicationScope.yyy.name}<br />
	In application scope, yyy -> age = ${applicationScope.yyy.age}
	<hr />
	
	Put p1 of stack context into session scope<br />
	<s:set var="zzz" value="#p1" scope="session" />
	In session scope, zzz -> name = ${sessionScope.zzz.name}<br />
	In session scope, zzz -> age = ${sessionScope.zzz.age}
	<hr />
	<br />
	<br />
	<s:debug />
</body>
</html>