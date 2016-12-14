<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:updownselect tag</title>
</head>
<body>
	<br />
	<s:form>
		<s:updownselect name="a" label="请选择您喜欢的图书" labelposition="top" moveUpLabel="向上移动" list="{'疯狂Java讲义','轻量级Java EE企业应用实战','经典Java EE企业应用实战'}" /><br />
		<s:updownselect name="b" label="请选择您想选择的出版日期" labelposition="top" moveDownLabel="向下移动" list="#{'疯狂Java讲义':'2008年9月', '轻量级Java EE企业应用实战':'2008年12月', '经典Java EE企业应用实战':'2010年6月'}" listKey="key" emptyOption="true" listValue="" /><br />
		<s:bean name="com.ngx20080110.service.BookService" var="bs"></s:bean>
		<s:updownselect list="#bs.books" name="c" label="请选择您喜欢的图书的作者" labelposition="top" selectAllLabel="全部选择" multiple="true" listKey="author" listValue="name" /><br />
	</s:form>
	<br />
	<br />
	<s:debug />
</body>