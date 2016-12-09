<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ page isELIgnored="true" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title><s:text name="loginPage" /></title>
</head>
<body>
	<s:form action="login">
		<s:textfield name="username" key="user" />
		<s:password name="password" key="pass" />
		<s:submit key="login" />
	</s:form>
	Test
	<br />
	TEMP=<s:property value="@java.lang.System@getenv('TEMP')" />
	<br />
	PI=<s:property value="@java.lang.Math@PI" />
	<br />
	FIB(11)=<s:property value="#fib=:[#this==0 ? 0 : #this==1 ? 1 : #fib(#this-2) + #fib(#this-1)], #fib(11)" />
	<br />
	<s:property value="#conv =:[#this==1?'M':#this==2?'F':''], #conv(1)" />
	<br />
</body>
</html>