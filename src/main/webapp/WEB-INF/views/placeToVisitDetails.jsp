<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PomysłNa</title>
</head>
<body>
<h1>Wybraliśmy dla Ciebie</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Place</th>
        <th>description</th>
    </tr>
        <tr>
 q            <td>${placeToVisit.place}</td>
            <td>${placeToVisit.description}</td>
        </tr>
</table>


</body>
</html>