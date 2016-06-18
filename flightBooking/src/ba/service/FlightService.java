package ba.service;



import ba.bean.SearchArrivalByFlight;
import ba.bean.SearchArrivalByRoute;
import ba.bean.SearchDepartureByFlight;
import ba.bean.SearchDepartureByRoute;
import ba.dao.SearchArrivalByFlightDao;
import ba.dao.SearchArrivalByRouteDAO;
import ba.dao.SearchDepartureByFlightDao;
import ba.dao.SearchDepartureByRouteDAO;

public class FlightService {
	public String searchDeparture(SearchDepartureByRoute searchByDeparture){
		SearchDepartureByRouteDAO searchByDepartureDao=new SearchDepartureByRouteDAO(searchByDeparture);
	String  responseString=searchByDepartureDao.searchDepartureByRoute();
		return responseString;
	}
	public String searchArrival(SearchArrivalByRoute searchByArrival){
		SearchArrivalByRouteDAO searchByArrivalDao=new SearchArrivalByRouteDAO(searchByArrival);
		String responseString=searchByArrivalDao.searchArrivalByRoute();
		return responseString;
	}

	public String searchDepartureByFlight(SearchDepartureByFlight searchDepartureByFlight){
		SearchDepartureByFlightDao searchDepartureByFlightDao=new SearchDepartureByFlightDao(searchDepartureByFlight);
		String responseString=searchDepartureByFlightDao.searchDepartureByFlight();
		return responseString;
	}
	public String searchArrivalByFlight(SearchArrivalByFlight searchArrivalByFlight){
		SearchArrivalByFlightDao searchArrivalByFlightDao=new SearchArrivalByFlightDao(searchArrivalByFlight);
		String responseString=searchArrivalByFlightDao.searchArrivalByFlight();
		return responseString;
	}
}
