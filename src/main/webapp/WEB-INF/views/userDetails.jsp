<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PomysłNa</title>
</head>
<body>
<h1>Dane użytkownika</h1>
<c:if test="${not empty user}">

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Active</th>
            <th>Email</th>
            <th>FirstName</th>
            <th>LastName</th>
            <th>Password</th>
            <th>Username</th>
        </tr>
            <tr>
                <td>${user.id}</td>
                <td>${user.active}</td>
                <td>${user.email}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.password}</td>
                <td>${user.username}</td>
            </tr>
    </table>
</c:if>

<a href="/users">Powrót do wszystkich użytkowników</a>
</body>
</html>