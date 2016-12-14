</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>s:optiontransferselect tag</title>
</head>
<body>
	<br />
	<s:form>
		<s:optiontransferselect
			label="Select books"
			name="cnbooks"
			leftTitle="Chinese books"
			rightTitle="English books"
			multiple="true"
			addToLeftLabel="move to left"
			selectAllLabel="select all"
			addAllToRightLabel="all to right"
			headerKey="cnKey"
			headerValue="--- Select Chinese book ---"
			emptyOption="true"
			doubleList="{'Expert One-on-One J2EE Design and Development', 'Javascript: The Definitive Guide'}"
			list="{'Java', 'Oracle', 'Linux'}"
			doubleName="enBook"
			doubleHeaderKey="enKey"
			doubleHeaderValue="--- Select English book ---"
			doubleEmptyOption="true"
			doubleMultiple="true"></s:optiontransferselect>
	</s:form>
	<br />
	<s:debug />
</body>
</html>