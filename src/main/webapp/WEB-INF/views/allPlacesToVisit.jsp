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
<h1>Wyszukaj miejsca dla siebie</h1>
<form class="padding-small text-center" action="/placeToVisit/search" method="post">
        <input type="number" id="time" name="time" placeholder="ile czasu?" required> <BR>
        Wybierz miejscowość początkową<BR>
        <input type="radio" name="startPlace" value="1"/>Gdańsk<BR>
        <input type="radio" name="startPlace" value="2"/>Katowice<BR>
        <input type="radio" name="startPlace" value="3"/>Kraków<BR>
        <input type="radio" name="startPlace" value="4"/>Poznań<BR>
        <input type="radio" name="startPlace" value="5"/>Szczecin<BR>
        <input type="radio" name="startPlace" value="6"/>Warszawa<BR>

        Wybierz cel<BR>
        <input type="radio" name="type" value="1"/>Odpoczynek<BR>
        <input type="radio" name="type" value="2"/>Aktywny odpoczynek<BR>
        <input type="radio" name="type" value="3"/>Restauracje<BR>
        <input type="radio" name="type" value="4"/>Dowolny<BR>


    <button class="btn btn-color rounded-0" type="submit">Wyszukaj</button>
</form>

<h1>Wszyskie miejsca do odwiedzenia</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Place</th>
        <th>description</th>
        <th>type</th>

    </tr>

    <c:forEach var="placeToVisit" items="${placesToVisit}">
        <tr>
            <td>${placeToVisit.id}</td>
            <td>${placeToVisit.place}</td>
            <td>${placeToVisit.description}</td>
            <td>${placeToVisit.type}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>