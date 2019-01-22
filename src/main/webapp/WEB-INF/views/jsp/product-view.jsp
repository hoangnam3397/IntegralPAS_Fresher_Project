<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>IntegralPAS Fresher</title>
</head>
<body>
	<a href="<c:url value="/product-list" />" >List Product</a><br />
	<h1>View Product:</h1>	
	Product ID: ${product.id} <br/>
	Product Name: ${product.name} <br/>
	Description: ${product.description} <br/>
</body>
</html>