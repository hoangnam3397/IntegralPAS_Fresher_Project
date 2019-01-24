<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>IntegralPAS Fresher</title>
</head>
<body>
  <a href="<c:url value="/product-list" />" >List Product</a><br />
  <h1>Add New Product:</h1>
  <c:url value="/insertProduct" var="insertProduct"/>
  <form:form action="${insertProduct}" method="POST"
    modelAttribute="product">
    <table>
    	<tr>
    		<td>Name: </td>
    		<td> <form:input path="name" required="true" /></td>
    	</tr>
    	<tr>
    		<td>Description: </td>
    		<td><form:input path="description" required="true" /> <br/> <br/></td>
    	</tr>
    </table>
    <button type="submit">Submit</button>
  </form:form>
</body>
</html>