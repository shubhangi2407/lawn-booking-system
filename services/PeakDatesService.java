package com.services;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Date;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.dao.BookingMasterDAO;
import com.dao.PeakDatesDAO;
import com.entity.BookingMaster;
import com.entity.PeakDates;

@Path("/dates")
public class PeakDatesService {

	@GET
	@Path("/greet")
	@Produces(MediaType.TEXT_PLAIN)
	public String greet()
	{
		
		return "Hello from service!";
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/peakdates")
	public ArrayList<PeakDates> getAllPeakDates()
	{
	PeakDatesDAO pddao = new PeakDatesDAO();
		ArrayList<PeakDates> lipd = pddao.getAllPeakDates();
		return lipd;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/availabledates")
	public ArrayList<BookingMaster> getAllBookingMaster()
	{
	BookingMasterDAO bmdao = new BookingMasterDAO();
	ArrayList<BookingMaster> libm=bmdao.getAllBookingMaster();
		return libm;
	}
	
	
	
	@POST
	@Path("/bookevent")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.TEXT_PLAIN)
	public String addBookingMaster(@FormParam("name") String name,@FormParam("address") String address,@FormParam("email") String email,@FormParam("city") String city,@FormParam("phoneno") String phoneno,@FormParam("space") String space,@FormParam("spid") int spid,@FormParam("fdate") String fdate,@FormParam("nodays") int nodays ,@FormParam("ename") String ename)
	{
		java.sql.Date tDate=null;
		StringTokenizer stok1 = new StringTokenizer(fdate,"-/.");
		int yr1 = Integer.parseInt(stok1.nextToken());
		int mon1 = Integer.parseInt(stok1.nextToken());
		int day1 = Integer.parseInt(stok1.nextToken());
		
		java.sql.Date fromDate = new java.sql.Date(yr1-1900,mon1-1,day1);
		
		long d1 = fromDate.getTime();
		
		
		if(nodays>1)
		{
		   long d2  = 	d1+((nodays-1)*24*60*60*1000);
		   
			tDate = new java.sql.Date(d2);
		}
		else
			tDate = new Date(fromDate.getTime());
		
	/*	StringTokenizer stok2 = new StringTokenizer(tDate,"-/.");
		int yr2 = Integer.parseInt(stok2.nextToken());
		int mon2 = Integer.parseInt(stok2.nextToken());
		int day2 = Integer.parseInt(stok2.nextToken());
		
		
		*/
		
		System.out.println(tDate);
		BookingMasterDAO bmdao = new BookingMasterDAO();
		BookingMaster bm = new BookingMaster(name,address,email,city,phoneno,space,spid,fromDate,tDate,ename);
		bmdao.addBookingMaster(bm);
		System.out.println("Adding new booking = "+name);
		
	return "OK";
	}
	
	





@POST	
@Path("/sndotp")
@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
@Produces(MediaType.TEXT_PLAIN)
public String sendSms(@FormParam("mno") String mno) {
		try {	
			System.out.println("Mobile no is " + mno);
			
			String apiKey = "apikey=" + "DR1kxhJwvNc-s0DW4cYkaSBuf0wu8eeodazzew4NN6";
			String message ="&message=" +"Thank You for Booking with Nandanvan Group !";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + mno;
			
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
			}
			rd.close();
			return stringBuffer.toString();
		} 
		catch (Exception e) 
		{
			System.out.println("Error SMS "+e);
			return "Error "+e;
		}
	
}
}
