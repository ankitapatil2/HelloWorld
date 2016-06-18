package ba.bean;

public class SearchDepartureByRoute {
	private String departureByLocation;
	private String arrivalByLocation;
	private String scheduledDepartureDate;
	private String response_format="json";
	private String client_key="56b6gf64apqwfzzvjex6wymy";

	
	
	
	
	public SearchDepartureByRoute(String departureByLocation,
			String arrivalByLocation, String scheduledDepartureDate) {
		super();
		this.departureByLocation = departureByLocation;
		this.arrivalByLocation = arrivalByLocation;
		this.scheduledDepartureDate = scheduledDepartureDate;
	}
	public String getDepartureByLocation() {
		return departureByLocation;
	}
	public void setDepartureByLocation(String departureByLocation) {
		this.departureByLocation = departureByLocation;
	}
	public String getArrivalByLocation() {
		return arrivalByLocation;
	}
	public void setArrivalByLocation(String arrivalByLocation) {
		this.arrivalByLocation = arrivalByLocation;
	}
	public String getScheduledDepartureDate() {
		return scheduledDepartureDate;
	}
	public void setScheduledDepartureDate(String scheduledDepartureDate) {
		this.scheduledDepartureDate = scheduledDepartureDate;
	}
	public String getResponse_format() {
		return response_format;
	}
	public void setResponse_format(String response_format) {
		this.response_format = response_format;
	}
	public String getClient_key() {
		return client_key;
	}
	public void setClient_key(String client_key) {
		this.client_key = client_key;
	}
}
