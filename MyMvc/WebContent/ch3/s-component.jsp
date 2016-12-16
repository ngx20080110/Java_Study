<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Sort</title>
</head>
<body>
	<s:set var="books" value="{'瘋狂Java講義','輕量級Java EE企業應用實戰','經典Java EE企業應用實戰'}" />
	<br />
	<h3>使用s:component標簽</h3>
	使用默認主題(xhtml)，默認主題目錄(template)<br />
	使用mytemplate.jsp爲視圖組件
	<s:component template="mytemplate.jsp">
		<s:param name="list" value="#books" />
	</s:component>
	<hr />
	使用自定義主題，自定義主題目錄<br />
	使用myAnotherTemplate.jsp作爲視圖組件
	<s:component templateDir="myTemplateDir" theme="myTheme" template="myAnotherTemplate.jsp">
		<s:param name="list" value="#books" />
	</s:component>
	<br />
	<s:debug />
</body>
</html>