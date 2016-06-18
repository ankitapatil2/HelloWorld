package ba.dao;

import java.io.BufferedReader;


import java.io.IOException;
import java.io.InputStreamReader;


import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import ba.bean.SearchArrivalByRoute;


public class SearchArrivalByRouteDAO {
	private String departureByLocation;
	private String arrivalByLocation;
	private String scheduledArrivalDate;
	private String response_format="json";
	private String client_key="56b6gf64apqwfzzvjex6wymy";

	
	
	public SearchArrivalByRouteDAO(SearchArrivalByRoute SearchArrivalByRoute) {
		departureByLocation=SearchArrivalByRoute.getDepartureByLocation();
		arrivalByLocation=SearchArrivalByRoute.getArrivalByLocation();
		scheduledArrivalDate=SearchArrivalByRoute.getScheduledArrivalDate();
		response_format=SearchArrivalByRoute.getResponse_format();
		client_key=SearchArrivalByRoute.getClient_key();
	
	}



	public String searchArrivalByRoute()
	{
		String url="http://apphonics.tcs.com/public/ba/flightinfo/1.0/flights;";
		String requestUrl=url+"departureLocation="+departureByLocation+";arrivalLocation="+arrivalByLocation+";scheduledArrivalDate="+scheduledArrivalDate+"."+response_format;
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
/*
	        Object obj=JSONValue.parse(rd.toString());
	        JSONArray finalResult=(JSONArray)obj;
	        System.out.println(finalResult);*/
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

