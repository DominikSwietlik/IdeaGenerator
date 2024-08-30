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

<form action="/login" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" required>
    <button type="submit">Login</button>
</form>
</body>
</html>