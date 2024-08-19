<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>All place to visit</title>
</head>
<body>
<h1>We propose you</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Place</th>
        <th>description</th>
    </tr>
        <tr>
            <td>${placeToVisit.id}</td>
            <td>${placeToVisit.place}</td>
            <td>${placeToVisit.description}</td>
        </tr>
</table>


</body>
</html>