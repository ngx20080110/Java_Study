</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:doubleselect tag</title>
</head>
<body>
	<br />
	<s:form action="x">
		<s:doubleselect label="Select books"
			list="{'Alan', 'Bob'}" name="author"
			doubleList="top == 'Alan' ? {'Alan book1', 'Alan book2'} : {'Bob bookA', 'Bob bookB', 'Bob bookC'}" doubleName="book" />
	</s:form>
	<br />
	<s:set var="bs" value="#{'Alan':{'Alan book 1', 'Alan book 2'}, 'Bob':{'Bob book A','Bob book B'}, 'Clay':{'Clay book I', 'Clay book II'}}" />
	<s:form action="y">
		<s:doubleselect label="books select" size="3"
		name="author" doubleList="#bs[top]" list="#bs.keySet()" doubleName="book" doubleSize="3"></s:doubleselect>
	</s:form>
	<br />
	<s:debug />
</body>
</html>