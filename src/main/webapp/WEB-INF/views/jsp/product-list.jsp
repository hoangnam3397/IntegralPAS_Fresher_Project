<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Helo Spring MVC + JDBC</title>
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
	<c:url value="/product-save" var="urlSave"/>
	<c:url value="/product-view/" var="urlView"/>
	<c:url value="/product-update/" var="urlUpdate"/>
	<c:url value="/productDelete/" var="urlDelete"/>
	<h1>List product:</h1>
	<a href="${urlSave}">Add product</a>
	<br />
	<br />


	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Description</th>
			<th>Action</th>
		</tr>
		<c:if test="${not empty listproduct}">
			<c:forEach var="product" items="${listproduct}">
				<tr style="border: 1px black solid">
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.description}</td>
					<td> <a href="${urlView}/${product.id}">View</a>
					<a href="${urlUpdate}/${product.id}">Edit</a>
				<a href="${urlDelete}/${product.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</c:if>
	</table>

</body>
</html>