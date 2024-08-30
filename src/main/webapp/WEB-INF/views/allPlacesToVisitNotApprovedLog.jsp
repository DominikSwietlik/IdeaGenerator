<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>PomysłNa</title>
</head>
<body>
<h1>Dodaj nowe miejsce</h1>
<form class="padding-small text-center" action="/placeToVisitNotApproved/add" method="post">

    <input type="text" id="place" name="place" placeholder="miejsce" required> <BR> <input type="text" id="description" name="description" placeholder="Opis" required> <BR>
    <input type="number" id="time_to_place_gd" name="time_to_place_gd" placeholder="Czas podróży z Gdańska w minutach" required> <BR>
    <input type="number" id="time_to_place_kat" name="time_to_place_kat" placeholder="Czas podróży z Katowic w minutach" required> <BR>
    <input type="number" id="time_to_place_kr" name="time_to_place_kr" placeholder="Czas podróży z Krakowa w minutach" required> <BR>
    <input type="number" id="time_to_place_poz" name="time_to_place_poz" placeholder="Czas podróży z Poznania w minutach" required> <BR>
    <input type="number" id="time_to_place_sz" name="time_to_place_sz" placeholder="Czas podróży z Szczecina w minutach" required> <BR>
    <input type="number" id="time_to_place_waw" name="time_to_place_waw" placeholder="Czas podróży z Warszawy w minutach" required> <BR>
    <input type="number" id="time_to_spend_max" name="time_to_spend_max" placeholder="Czas do spędzenia na miejscu maksymalnie w minutach" required> <BR>
    <input type="number" id="time_to_spend_min" name="time_to_spend_min" placeholder="Czas do spędzenia na miejscu minimalnie w minutach" required> <BR>
    Typ spędzanego czasu<BR>
    <input type="radio" name="type" value="1"/>Odpoczynek<BR>
    <input type="radio" name="type" value="2"/>Aktywne spędzanie czasu<BR>
    <input type="radio" name="type" value="3"/>Restauracja<BR>


    <button class="btn btn-color rounded-0" type="submit">Dodaj</button>
</form>

<h1>Miejsca oczekujące na dodanie</h1>
<table border="1">
    <tr>
        <th>Id</th>
        <th>Description</th>
        <th>Place</th>
        <th>time_to_place_gd</th>
        <th>time_to_place_kat</th>
        <th>time_to_place_kr</th>
        <th>time_to_place_poz</th>
        <th>time_to_place_sz</th>
        <th>time_to_place_waw</th>
        <th>type</th>
        <th>time_to_spend_min</th>
        <th>time_to_spend_max<th>
        <th>Opcje</th>

    </tr>

    <c:forEach var="placeToVisitNotApproved" items="${placesToVisitNotApproved}">
        <tr>
            <td>${placeToVisitNotApproved.id}</td>
            <td>${placeToVisitNotApproved.description}</td>
            <td>${placeToVisitNotApproved.place}</td>
            <td>${placeToVisitNotApproved.timeToPlaceGd}</td>
            <td>${placeToVisitNotApproved.timeToPlaceKat}</td>
            <td>${placeToVisitNotApproved.timeToPlaceKr}</td>
            <td>${placeToVisitNotApproved.timeToPlacePoz}</td>
            <td>${placeToVisitNotApproved.timeToPlaceSz}</td>
            <td>${placeToVisitNotApproved.timeToPlaceWaw}</td>
            <td>${placeToVisitNotApproved.type}</td>
            <td>${placeToVisitNotApproved.timeToSpendMin}</td>
            <td>${placeToVisitNotApproved.timeToSpendMax}</td>
            <td><form class="padding-small text-center" action="/placeToVisitNotApproved/edit" method="post">
                <input type="hidden" name="id" value=${placeToVisitNotApproved.id}>
            <button class="btn btn-color rounded-0" type="submit">Edytuj</button>
            </form>
                <form class="padding-small text-center" action="/placeToVisitNotApproved/delete" method="post">
                <input type="hidden" name="id" value="${placeToVisitNotApproved.id}">
                <button class="btn btn-color rounded-0" type="submit">Usuń</button>
            </form>
                <form class="padding-small text-center" action="/placeToVisitNotApproved/accept" method="post">
                <input type="hidden" name="id" value="${placeToVisitNotApproved.id}">
                <button class="btn btn-color rounded-0" type="submit">Akceptuj</button>
            </form>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>