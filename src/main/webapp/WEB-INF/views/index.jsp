<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PomysłNa</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        .navbar {
            background-color: #f0f0f0;
            padding: 10px;
            border-radius: 5px;
        }
        .navbar a {
            margin: 0 15px;
            text-decoration: none;
            color: #007BFF;
        }
        .navbar a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<div class="navbar">
    <a href="/">Strona Główna</a>
    <a href="/placeToVisit">Miejsca do Zwiedzania</a>
    <a href="/placeToVisitNotApproved">Miejsca Niezatwierdzone</a>
    <a href="/login">Logowanie</a>
</div>


<h1>Aplikacja PomysłNa</h1>
<p>Skorzystaj jeśli nie masz pomysłu co robić.</p>

</body>
</html>