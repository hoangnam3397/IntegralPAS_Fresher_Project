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
  <c:url value="/product-view/" var="urlView"/>
	<c:url value="/product-update/" var="urlUpdate"/>
	<c:url value="/productDelete/" var="urlDelete"/>
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
          <td>${product.description}</td>
          <td> <a href="${urlView}/${product.id}">View</a>
         		<a href="${urlUpdate}/${product.id}">Update</a>
   				<a href="#" onclick="deleteProduct('${product.id}')">Delete</a></td>
        </tr>
      </c:forEach>
    </c:if>
</table>
<script type="text/javascript">
	function deleteProduct(productId) {
		if (confirm('Do you want to delete this project?')) {
			window.location.href="${urlDelete}/"+productId;
		} else {
		    // Do nothing!
		}
	}
</script>
</body>
</html>