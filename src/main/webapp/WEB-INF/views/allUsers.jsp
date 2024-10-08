<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PomysłNa</title>
</head>
<body>
<div class="navbar">
    <a href="/">Strona Główna</a>
    <a href="/placeToVisit">Miejsca do Zwiedzania</a>
    <a href="/placeToVisitNotApproved">Miejsca Niezatwierdzone</a>
    <a href="/login">Logowanie</a>
</div>
<h1>Wszyscy użytkownicy</h1>
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
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.active}</td>
            <td>${user.email}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.password}</td>
            <td>${user.username}</td>
        </tr>
    </c:forEach>
</table>

<form class="padding-small text-center" action="/users/searchById" method="post">
    <input type="number" id="id" name="id" placeholder="Podaj id" required>
    <button class="btn btn-color rounded-0" type="submit">Zaloguj</button>
</form>
</body>
</html>