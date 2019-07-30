<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="products?action=create">Create new product</a>
</p>
<table border="1">
    <input type="text" name="seach">
    <input type="submit" value="seach">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Brand</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items="${requestScope['products']}" var="product">
        <tr>
            <td><a href="products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${producs.getDescription()}</td>
            <td>${product.getBrand()}</td>
            <td><a href="products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

