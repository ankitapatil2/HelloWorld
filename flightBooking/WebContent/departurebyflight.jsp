<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Departure By Route</title>

<style>
.input1
{
    height:35px;
    width:600px
    font-size:14pt;
}
select,input {
    font-size: 15px;
}


</style>
</head>
<body>
<form action="SearchController1" method="get">
<input type="hidden" name="optionSubmit" value="DepartureByFlight">
<table align="center">





<tr></tr>
<tr></tr>

<br><br>


<tr>
<td><strong><label for="dloc"><font size="5">Flight No</font></label></strong><br> </td>
<td>
<input type="text" name="flight">
</td>
</tr>
<td><br><strong><label for="pickup"><font size="5">Scheduled Departure Date</font></label></strong> <br></td>
<td><br>
<input type="date" name="departureDate">
</td>
</tr>

<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<td></td>
<td><br><br><input type="submit" value="Search" align="middle"  class="input1"></td></tr>
</table>
</body>
</html>