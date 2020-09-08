<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>My Calculator</title>
</head>
<body>

	<form:form action="calculate" method="post"
		modelAttribute="CalculatorModel">
		<table>
			<tr>
				<td>First Number:</td>
				<td><form:input path="num1" /></td>
			</tr>
			<tr>
				<td>Second Number:</td>
				<td><form:input path="num2" /></td>
			</tr>
			<tr>
				<td>Operation:</td>
				<td><form:input path="operation" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>