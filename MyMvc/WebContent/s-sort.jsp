<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<br />
	<s:bean var="mycomparator" name="com.ngx20080110.util.MyComparator" />
	<s:sort source="{'Java', 'C#', 'PHP', 'C', 'C++'}" comparator="#mycomparator" var="sortedList" />
	sortedList:<br />
	${pageScope.sortedList}
	<br />
	<table border="1" style="width:200px">
		<s:iterator status="st" value="#attr.sortedList">
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