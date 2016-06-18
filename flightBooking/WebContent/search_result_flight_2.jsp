<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>
<% %>    
<!DOCTYPE html>
<html lang="en">
<head>
<title>Search Results</title>
<meta charset="utf-8">
<meta name="format-detection" content="telephone=no" />
<script>

	$(document).ready(function() {
		$().UItoTop({
			easingType : 'easeOutQuart'
		});
	});
</script>
<style type="text/css">
	.search{
	text-align: center;
	}
.search th{
	text-decoration: underline;
}
</style>

<script>
<% System.out.println(request.getAttribute("jsonResponse1").toString());%>

function result()
{
var json = <%=request.getAttribute("jsonResponse1")%>;

var table = document.getElementById("myTable");
document.getElementById("fno").innerHTML= json.FlightsResponse.Flight.FlightNumber;


  document.getElementById("deptloc").innerHTML= json.FlightsResponse.Flight.Sector.DepartureAirport;
 
 
   document.getElementById("arrloc").innerHTML= json.FlightsResponse.Flight.Sector.ArrivalAirport;


 var str1 = json.FlightsResponse.Flight.Sector.ScheduledDepartureDateTime;
 var depttime = str1.substring(11);
 document.getElementById("depttime").innerHTML = depttime;
 var str2 = json.FlightsResponse.Flight.Sector.ScheduledArrivalDateTime;
 var arrtime = str2.substring(11);
 document.getElementById("arrtime").innerHTML = arrtime;
 var str3 = json.FlightsResponse.Flight.Sector.ScheduledDepartureDateTime;
 var deptDate = str3.substring(0,10);
 var ddate = new Date(deptDate).toUTCString();
 document.getElementById("deptDate").innerHTML = ddate.substring(0,16);
 var str4 = json.FlightsResponse.Flight.Sector.ScheduledArrivalDateTime;
 var arrdate = str4.substring(0,10);
 var adate = new Date(arrdate).toUTCString();
 document.getElementById("arrDate").innerHTML = adate.substring(0,16);

 }
result();
</script>
</head>
<body onload="result()">

	<!--==============================Content=================================-->
	
	<div class="content">
		<div class="ic"></div>
		<div class="container_12">
		<br>
		<div>
	
		
		
				<span class="searchInfo">Flight Details</span>&nbsp; &nbsp;&nbsp;
				<span class="searchInfo" id="deptDate"></span><span class="searchInfo"> To </span><span class="searchInfo" id="arrDate"></span>
			<table class="search" border="1">
				<tr style="border-width: 15px">
					<td style="width: 75px"></td>
					<td style="width: 125px"><label><b>FLIGHT NO. </b></label></td>
			
					<td><label><b>DEPARTURE</b></label></td>
	
					<td><label><b>DEPARTURE LOCATION</b></label></td>
				
					<td><label><b>ARRIVAL</b></label></td>
		
					<td><label><b>ARRIVAL LOCATION</b></label></td>
		


					<td><label></label></td>
					<td>&nbsp; &nbsp;</td>
				</tr>
				<tr style="height: 10px"></tr>
				<tr style="height: 10px"></tr>
				<tr>
					<td></td>
					<td id="fno"><label></label></td>
				
					<td  id="depttime"><label></label></td>
				
					<td  id="deptloc"><label></label></td>
				
					<td  id="arrtime"><label></label></td>
			
					<td id="arrloc"><label></label></td>
		
					<td id="col4"><label></label></td>
			
				</tr>
				
			</table>
			</div>
		</div>
	</div>
	

	<script>
		$(function() {
			$('#bookingForm').bookingForm({
				ownerEmail : '#'
			});
		})
	</script>
</body>
</html>