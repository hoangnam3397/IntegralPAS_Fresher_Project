<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>IntegralPAS Fresher</title>
<style>
table, th, td {
  border: 1px solid black;
}
td {
  padding-right: 30px;
}
</style>
</head>
<body>
  <c:url value="/product-insert" var="urlInsert"/>
<h1>List Product:</h1>
<a href="${urlInsert}">Add</a>
<br/>
<br/>

<table>
	<tr>
		<th>ID</th>
		<th>Product Name</th>
		<th>Description </th>
		<th>Action </th>
	</tr>
	<c:if test="${not empty listProduct}">
      <c:forEach var="product" items="${listProduct}">
        <tr style="border: 1px black solid">
          <td>${product.id}</td>
          <td>${product.name}</td>
          <td>${product.depscription}</td>
          <td> <a href="#">View</a>
         		<a href="#">Update</a>
   				<a href="#">Delete</a></td>
        </tr>
      </c:forEach>
    </c:if>
</table>
</body>
</html>