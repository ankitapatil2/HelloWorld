package ba.bean;


public class SearchDepartureByFlight {

	private String flightNo;
	private String DepartureDate;
	private String response_format="json";
	private String client_key="56b6gf64apqwfzzvjex6wymy";
	
	public SearchDepartureByFlight(String flightNo, String departureDate) {
		this.flightNo = flightNo;
		this.DepartureDate = departureDate;
	}

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getDepartureDate() {
		return DepartureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.DepartureDate = departureDate;
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
