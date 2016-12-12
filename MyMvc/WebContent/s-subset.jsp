<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Iterator</title>
</head>
<body>
	<table border="1" style="width:200px">
		<s:subset source="{'Java', 'C#', 'PHP', 'C', 'C++'}" start="1" count="3">
			<s:iterator status="st">
				<tr <s:if test="#st.odd">style="background-color:#ccddee"</s:if>>
					<td><s:property/></td>
				</tr>
			</s:iterator>
		</s:subset>
	</table>
	<br />
	<s:bean var="mydecider" name="com.ngx20080110.util.MyDecider" />
	<s:subset source="{'Java', 'C#', 'PHP', 'C', 'C++'}" decider="#mydecider" var="newList" />
	newList:<br />
	${pageScope.newList}
	<br />
	<table border="1" style="width:200px">
		<s:iterator status="st" value="#attr.newList">
			<tr <s:if test="#st.odd">style="background-color:#ccddee"</s:if>>
				<td><s:property/></td>
			</tr>
		</s:iterator>
	</table>
	<br />
	<br />
	<s:debug />
</body>
</html>