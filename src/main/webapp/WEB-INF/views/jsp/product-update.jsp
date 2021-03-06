<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<title>IntegralPAS Freshe</title>
</head>
<body>
	<a href="<c:url value="/product-list" />">List Product</a>
	<br />

	<h1>Edit Product:</h1>
	<c:url value="/updateProduct" var="updateProduct" />
	<form:form action="${updateProduct}" method="POST" modelAttribute="product">
		 <table>
		 <tr>
    		<td>Id:  </td>
    		<td><form:input path="id" readonly="true" /></td>
    	</tr>
    	<tr>
    		<td>Name: </td>
    		<td> <form:input path="name" required="true" /></td>
    	</tr>
    	<tr>
    		<td>Description: </td>
    		<td><form:input path="description" required="true"  /> <br/> <br/></td>
    	</tr>
    </table>
    		<button type="submit">Submit</button>
	</form:form>

</body>
</html>