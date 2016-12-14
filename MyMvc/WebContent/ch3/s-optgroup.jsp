<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:optgroup tag</title>
</head>
<body>
	<br />
	<s:form>
		<s:select list="#{'Java':2001, 'Oracle':2002, 'Linux':2003}" label="select books" name="book" size="7" listKey="value" listValue="key">
			<s:optgroup label="Level 1" list="#{'Expert':2005, 'Ada':2006}" listKey="value" listValue="key" />
			<s:optgroup label="Level 2" list="#{'Cloud':2007, 'BI':2008}" listKey="value" listValue="key" />
		</s:select>
	</s:form>
	<br />
	<br />
	<s:debug />
</body>