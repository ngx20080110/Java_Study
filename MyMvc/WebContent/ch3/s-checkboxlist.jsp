<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:checkboxlist tag</title>
</head>
<body>
	<br />
	<s:form>
		<s:checkboxlist labelposition="top" list="{'Java', 'Oracle', 'Linux'}" name="a" label="Skills" />
		<br />
		<s:checkboxlist list="#{'Java':'2008', 'Oracle': 2009, 'Linux': 2010}" name="b" label="Skills Time" labelposition="top" listKey="key" listValue="value" />
		<br />
		<s:bean name="com.ngx20080110.service.BookService" var="bs" />
		<s:checkboxlist list="#bs.books" name="c" label="Books" labelposition="top" 
			listKey="author" listValue="name" />
	</s:form>
	<br />
	<br />
	<s:debug />
</body>
</html>