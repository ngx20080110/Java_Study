<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>List屬性的類型轉換</title>
<s:head/>
</head>
<body>
	<br />
	<h3>List屬性的類型轉換</h3>
	<s:form action="login46">
		<s:iterator value="{1, 2, 3}" status="st">
			<s:textfield name="users[%{#st.index}]" label="第%{#st.index + 1}個用戶信息" />
		</s:iterator>
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