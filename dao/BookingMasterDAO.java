package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;

import java.sql.Statement;

import java.sql.Connection;


import com.entity.BookingMaster;


public class BookingMasterDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addBookingMaster(BookingMaster bm)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into BookingMaster (CustName,Address,Email,City,PhoneNo,BookingType,SpaceID,BookDateFrom,BookDateTo,EventName) values(?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,bm.getCustName());
pstmt.setString(2,bm.getAddress());
pstmt.setString(3,bm.getEmail());
pstmt.setString(4,bm.getCity());
pstmt.setString(5,bm.getPhoneNo());
pstmt.setString(6,bm.getBookingType());
pstmt.setInt(7,bm.getSpaceID());
java.sql.Date d1 = new java.sql.Date(bm.getBookDateFrom().getTime());
pstmt.setDate(8,d1);
java.sql.Date d2 = new java.sql.Date(bm.getBookDateTo().getTime());
pstmt.setDate(9,d2);
pstmt.setString(10,bm.getEventName());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Food Categeory Id is "+ rs.getInt(1);
		
pstmt.close();
		
con.close();
		
msg="Ok";
		
	
}
		
catch(SQLException e)
		
{
			
e.printStackTrace();
			
msg=e.toString();
		
}
}
	
	
	
else
{
		
		
System.out.println("Connection is null !");
		
msg="Connection is null";

}		
		
return msg;
	

}

	
public ArrayList<BookingMaster> 
getAllBookingMaster()

	{
		
ArrayList<BookingMaster>libm = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from BookingMaster";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int bmmid =rs.getInt(1);
				
String bmcname=rs.getString(2);

String bmadd=rs.getString(3);
String bmem=rs.getString(4);
String bmci=rs.getString(5);
String bmpno=rs.getString(6);
String bmbt=rs.getString(7);
int bmsid=rs.getInt(8);
Date bmbdf=rs.getDate(9);
Date bmbdt=rs.getDate(10);
String bmename=rs.getString(11);				
BookingMaster bm =new BookingMaster(bmmid,bmcname,bmadd,bmem,bmci,bmpno,bmbt,bmsid,bmbdf,bmbdt,bmename);
				
libm.add(bm);
				
				
			
}
			
rs.close();
			
stmt.close();
			
con.close();
			
			
			
		
}
		
catch(SQLException e)
				
{
			
e.printStackTrace();
				
}
}

return libm;	
}

}

