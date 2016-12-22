<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
	<title>¨Ï¥ÎJSON´¡¥ó</title>
	<script type="text/javascript" src="${pageContext.request.contextPath}/jquery-3.1.1.min.js"></script>
</head>
<body>
	<s:form id="loginForm">
		<s:textfield name="username" key="user" />
		<s:password name="password" key="pass" />
		<tr><td colspan="2">
		<input id="loginBn" type="button" value="submit" />
		</td></tr>
	</s:form>
	<div id="show" style="display:none;">
	</div>
	<script type="text/javascript">
		$("#loginBn").click(function(){
			$.get("login_411", $("#loginForm").serializeArray(),
			function(data, statusText) {
				$("#show")
				.height(80)
				.width(300)
				.css("border", "1px solid black")
				.css("background-color", "#efef99")
				.css("color", "#ff0000")
				.css("padding", "20px")
				.empty();
				$("#show").append("Result: " + data + "<br />");
				$("#show").show(2000);
			},
			"html");
		});
	</script>
</body>
</html>