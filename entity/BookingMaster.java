package com.entity;


import java.util.Date;


public class BookingMaster 
{
	
private int BookingMasterID;

		private String CustName;

		private String Address;

		private String Email;
	
	        private String City;

		private String PhoneNo;

		private String BookingType;

		private int SpaceID;
	
	        private Date BookDateFrom;

		private Date BookDateTo;

		private String EventName;


public BookingMaster()
{
	
//TODO Auto-generated constructor stub

}

public BookingMaster(String custName, String address, String email, String city, String phoneNo, String bookingType,
		int spaceID, Date bookDateFrom, Date bookDateTo, String eventName) 
{
	
super();

	CustName = custName;

	Address = address;
	
        Email = email;

	City = city;
	
PhoneNo = phoneNo;
	
BookingType = bookingType;

	SpaceID = spaceID;

	BookDateFrom = bookDateFrom;
	
BookDateTo = bookDateTo;
	
EventName = eventName;

}

public BookingMaster(int bookingMasterID, String custName, String address, String email, String city, String phoneNo,
String bookingType, int spaceID, Date bookDateFrom, Date bookDateTo, String eventName) 
{
	
super();

	BookingMasterID = bookingMasterID;

	CustName = custName;

	Address = address;

	Email = email;
	
City = city;

	PhoneNo = phoneNo;

	BookingType = bookingType;

	SpaceID = spaceID;

	BookDateFrom = bookDateFrom;

	BookDateTo = bookDateTo;
	
EventName = eventName;

}

public int getBookingMasterID() {

	return BookingMasterID;

}

public void setBookingMasterID(int bookingMasterID) 
{

	BookingMasterID = bookingMasterID;

}

public String getCustName()
 {
	
return CustName;

}

public void setCustName(String custName) 
{
	
CustName = custName;

}

public String getAddress() 
{
	
return Address;

}

public void setAddress(String address) 
{
	
Address = address;

}

public String getEmail()
 {
	
return Email;

}

public void setEmail(String email) 
{
	
Email = email;

}

public String getCity()
 {
	
return City;

}

public void setCity(String city)
 {
	
City = city;

}

public String getPhoneNo() 
{
	
return PhoneNo;

}

public void setPhoneNo(String phoneNo) 
{
	
PhoneNo = phoneNo;

}

public String getBookingType()
 {
	
return BookingType;

}

public void setBookingType(String bookingType)
 {
	
BookingType = bookingType;

}

public int getSpaceID() 
{
	
return SpaceID;

}

public void setSpaceID(int spaceID) 
{
	
SpaceID = spaceID;

}

public Date getBookDateFrom() 
{
	
return BookDateFrom;

}

public void setBookDateFrom(Date bookDateFrom)
 {
	
BookDateFrom = bookDateFrom;

}

public Date getBookDateTo()
 {
	
return BookDateTo;

}

public void setBookDateTo(Date bookDateTo) 
{
	
BookDateTo = bookDateTo;

}

public String getEventName() 
{
	
return EventName;

}

public void setEventName(String eventName)
 {
	
EventName = eventName;

}

}
