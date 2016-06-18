package ba.dao;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import ba.bean.SearchDepartureByFlight;


public class SearchDepartureByFlightDao {

	private String flightNo;
	private String DepartureDate;
	private String response_format;
	private String client_key;
	
	public SearchDepartureByFlightDao(SearchDepartureByFlight searchDepartureByFlight){
		flightNo=searchDepartureByFlight.getFlightNo();
		DepartureDate=searchDepartureByFlight.getDepartureDate();
		response_format=searchDepartureByFlight.getResponse_format();
		client_key=searchDepartureByFlight.getClient_key();
	}
	
	public String searchDepartureByFlight(){
		
		String url="http://apphonics.tcs.com/public/ba/flightinfo/1.0/flights;";
		String requestUrl=url+"flightNumber="+flightNo+";scheduledDepartureDate="+DepartureDate+"."+response_format;
		HttpClient client=new DefaultHttpClient();
		HttpGet request = new HttpGet(requestUrl);
		request.addHeader("Client-Key", client_key);		
		HttpResponse response=null;
		System.out.println("Request URL: "+requestUrl);
		try {
			response=client.execute(request);
			System.out.println(response);
		} catch (ClientProtocolException e) {
			
		} catch (IOException e) {
			
		}
		String s="";
		BufferedReader rd=null;
		try {
			rd=new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		} catch (IllegalStateException e) {
			System.out.println("IllegalStateException");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String line="";
		try {
			System.out.println(rd);
			while((line=rd.readLine())!=null)
			{
				s=s.concat(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s;
		
	}
	
}
