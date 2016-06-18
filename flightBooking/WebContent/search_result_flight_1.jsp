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
<!-- <script>

	$(document).ready(function() {
		$().UItoTop({
			easingType : 'easeOutQuart'
		});
	});
</script> -->
<style type="text/css">
	.search{
	text-align: center;
	}
.search th{
	text-decoration: underline;
}
</style>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
 <% System.out.println(request.getAttribute("jsonResponse1").toString());%>
 
 function result(){
   
	
	 var json = <%=request.getAttribute("jsonResponse1")%>;
    for(var i=0;i<json.FlightsResponse.Flight.length;i++)
    {

        var tr="<tr>";
        var td1="<td>"+json.FlightsResponse.Flight[i].FlightNumber+"</td>";
         var td3="<td>"+json.FlightsResponse.Flight[i].Sector.ScheduledDepartureDateTime.substring(11)+"</td>";
         var td5="<td>"+json.FlightsResponse.Flight[i].Sector.DepartureAirport+"</td>";
         var td7="<td>"+json.FlightsResponse.Flight[i].Sector.ScheduledArrivalDateTime.substring(11)+"</td>";
        var td9="<td>"+json.FlightsResponse.Flight[i].Sector.ArrivalAirport+"</td>";
       // var td7="<td><input type="submit" value="Book Now" align="middle" class="input1"></td></tr>";
            
       $("#mytable").append(tr+td1+td3+td5+td7+td9); 

    } var str3 = json.FlightsResponse.Flight[0].Sector.ScheduledDepartureDateTime;
    var deptDate = str3.substring(0,10);
    var ddate = new Date(deptDate).toUTCString();
    document.getElementById("deptDate").innerHTML = ddate.substring(0,16);
    var str4 = json.FlightsResponse.Flight[0].Sector.ScheduledArrivalDateTime;
    var arrdate = str4.substring(0,10);
    var adate = new Date(arrdate).toUTCString();
    document.getElementById("arrDate").innerHTML = adate.substring(0,16);
    
    }result();
</script>
</head>
<body onload="result()">

	<!--==============================Content=================================-->
	
	 	<div class="content">
		<div class="ic"></div>
		<div class="container_12">
		<br>
		<div id="div1">
	
		
		
				<span class="searchInfo">Flight Details</span>&nbsp; &nbsp;&nbsp;
				<span class="searchInfo" id="deptDate"></span><span class="searchInfo"> To </span><span class="searchInfo" id="arrDate"></span>
			<table class="search" id="mytable" border="1">
				<tr style="border-width: 15px">
					
					<td style="width: 125px"><label><b>FLIGHT NO. </b></label></td>
					

					<td><label><b>DEPARTURE</b></label></td>
				
					<td><label><b>DEPARTURE LOCATION</b></label></td>
					
					<td><label><b>ARRIVAL</b></label></td>
					
					<td><label><b>ARRIVAL LOCATION</b></label></td>
					

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