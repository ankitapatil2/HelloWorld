package ba.bean;

public class SearchArrivalByRoute {
	private String departureByLocation;
	private String arrivalByLocation;
	private String scheduledArrivalDate;
	private String response_format="json";
	private String client_key="56b6gf64apqwfzzvjex6wymy";
	
	
	
	public SearchArrivalByRoute(String departureByLocation,
			String arrivalByLocation, String scheduledArrivalDate) {
		super();
		this.departureByLocation = departureByLocation;
		this.arrivalByLocation = arrivalByLocation;
		this.scheduledArrivalDate = scheduledArrivalDate;
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
	public String getScheduledArrivalDate() {
		return scheduledArrivalDate;
	}
	public void setScheduledArrivalDate(String scheduledArrivalDate) {
		this.scheduledArrivalDate = scheduledArrivalDate;
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
