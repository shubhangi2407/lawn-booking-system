package com.entity;

import java.util.*;

public class BookingDetails {
	
private int BookingDetailID;

	private int BookingMasterID;


	private Date BookDate;
	
	private String Time;
	
	private int FoodPackageID;



	private int DecorationID;

	private int NoOfPeople;

	public BookingDetails() {
		super();
	}

	public BookingDetails(int bookingMasterID, Date bookDate, String time, int foodPackageID, int decorationID,
			int noOfPeople) {
		super();
		BookingMasterID = bookingMasterID;
		BookDate = bookDate;
		Time = time;
		FoodPackageID = foodPackageID;
		DecorationID = decorationID;
		NoOfPeople = noOfPeople;
	}

	public BookingDetails(int bookingDetailID, int bookingMasterID, Date bookDate, String time, int foodPackageID,
			int decorationID, int noOfPeople) {
		super();
		BookingDetailID = bookingDetailID;
		BookingMasterID = bookingMasterID;
		BookDate = bookDate;
		Time = time;
		FoodPackageID = foodPackageID;
		DecorationID = decorationID;
		NoOfPeople = noOfPeople;
	}

	public int getBookingDetailID() {
		return BookingDetailID;
	}

	public void setBookingDetailID(int bookingDetailID) {
		BookingDetailID = bookingDetailID;
	}

	public int getBookingMasterID() {
		return BookingMasterID;
	}

	public void setBookingMasterID(int bookingMasterID) {
		BookingMasterID = bookingMasterID;
	}

	public Date getBookDate() {
		return BookDate;
	}

	public void setDate(Date bookDate) {
		BookDate = bookDate;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public int getFoodPackageID() {
		return FoodPackageID;
	}

	public void setFoodPackageID(int foodPackageID) {
		FoodPackageID = foodPackageID;
	}

	public int getDecorationID() {
		return DecorationID;
	}

	public void setDecorationID(int decorationID) {
		DecorationID = decorationID;
	}

	public int getNoOfPeople() {
		return NoOfPeople;
	}

	public void setNoOfPeople(int noOfPeople) {
		NoOfPeople = noOfPeople;
	}

	

}
