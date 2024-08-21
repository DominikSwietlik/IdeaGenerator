<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Add place</title>
</head>
<body>
<h1>Searcher</h1>
<form class="padding-small text-center" action="/placeToVisit/add" method="post">
    <input type="text" id="description" name="description" placeholder="Opis" required> <BR>
    <input type="text" id="place" name="place" placeholder="miejsce" required> <BR>
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

</body>
</html>