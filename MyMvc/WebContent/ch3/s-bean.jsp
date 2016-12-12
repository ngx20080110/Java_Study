<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	<s:bean name="com.ngx20080110.bean.Person">
		<s:param name="name" value="'wugy'" />
		<s:param name="age" value="30" />
		Person instance name=<s:property value="name" /><br />
		Person instance age=<s:property value="age" />
	</s:bean>
	<br />
	<s:bean name="com.ngx20080110.bean.Person" var="p1">
		<s:param name="name" value="'Gordon'" />
		<s:param name="age" value="4" />
	</s:bean>
	Person P1 name=<s:property value="#p1.name" /><br />
	Person P1 age=<s:property value="#p1.age" /><br />
	${requestScope.p1}
	<br />
	<br />
	<s:debug />
</body>
</html>