<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>IntegralPAS Fresher</title>
</head>
<body>
  <a href="<c:url value="/product-list" />" >List Customer</a><br />
  <h1>Add new Product:</h1>
  <c:url value="/insertProduct" var="insertProduct"/>
  <form:form action="${insertProduct}" method="POST"
    modelAttribute="product">
      Name: <form:input path="name" /> <br/> <br/>
      Description: <form:input path="description" /> <br/> <br/>
    <button type="submit">Submit</button>
  </form:form>
</body>
</html>