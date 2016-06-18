package ba.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ba.bean.SearchArrivalByFlight;
import ba.bean.SearchArrivalByRoute;
import ba.bean.SearchDepartureByFlight;
import ba.bean.SearchDepartureByRoute;
import ba.service.FlightService;

/**
 * Servlet implementation class SearchController1
 */
public class SearchController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String searchOption=request.getParameter("optionSubmit");
		
		FlightService flightService=new FlightService();
		System.out.println(searchOption);
if("departureByRoute".equals(searchOption)){
			
			//System.out.println(request.getParameter("departureLocation")+request.getParameter("arrivalLocation")+request.getParameter("departureDate"));
			
			SearchDepartureByRoute searchDepartureByRoute=new SearchDepartureByRoute(request.getParameter("departurelocation"),request.getParameter("arrivallocation"),request.getParameter("scheduleddeparturedate"));
			
			String jsonString1=flightService.searchDeparture(searchDepartureByRoute);
			request.setAttribute("jsonResponse1", jsonString1);
				RequestDispatcher rd=request.getRequestDispatcher("search_result_flight_1.jsp");
			rd.forward(request, response);
			
		}
if("arrivalByRoute".equals(searchOption)){
	
	SearchArrivalByRoute searchArrivalByRoute=new SearchArrivalByRoute(request.getParameter("departurelocation"),request.getParameter("arrivallocation"),request.getParameter("scheduledarrivaldate"));
			
			String jsonString1=flightService.searchArrival(searchArrivalByRoute);
			request.setAttribute("jsonResponse1", jsonString1);
				RequestDispatcher rd=request.getRequestDispatcher("search_result_flight_1.jsp");
			rd.forward(request, response);
			
		}

if("DepartureByFlight".equals(searchOption)){
		
		//System.out.println(request.getParameter("departureLocation")+request.getParameter("DepartureLocation")+request.getParameter("departureDate"));
		
		SearchDepartureByFlight searchDepartureByFlight=new SearchDepartureByFlight(request.getParameter("flight"),request.getParameter("departureDate"));
		
		String jsonString1=flightService.searchDepartureByFlight(searchDepartureByFlight);
		request.setAttribute("jsonResponse1", jsonString1);
			RequestDispatcher rd=request.getRequestDispatcher("search_result_flight_2.jsp");
		rd.forward(request, response);
		
	}

if("ArrivalByFlight".equals(searchOption)){
	
	//System.out.println(request.getParameter("departureLocation")+request.getParameter("arrivalLocation")+request.getParameter("departureDate"));
	
	SearchArrivalByFlight searchArrivalByFlight=new SearchArrivalByFlight(request.getParameter("flight"),request.getParameter("arrivalDate"));
	
	String jsonString1=flightService.searchArrivalByFlight(searchArrivalByFlight);
	request.setAttribute("jsonResponse1", jsonString1);
		RequestDispatcher rd=request.getRequestDispatcher("search_result_flight_1.jsp");
	rd.forward(request, response);
	
}
	}

}
