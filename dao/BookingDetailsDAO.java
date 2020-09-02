package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.sql.Statement;
import java.sql.Date;

import com.entity.BookingDetails;



public class BookingDetailsDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addBookingDetails(BookingDetails bd)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into BookingDetails(BookingMasterID,BookDate,Time,FoodPackageID,DecorationID,NoOfPeople) values(?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setInt(1,bd.getBookingMasterID());
pstmt.setDate(2,(Date) bd.getBookDate());
pstmt.setString(3,bd.getTime());
pstmt.setInt(4,bd.getFoodPackageID());
pstmt.setInt(5,bd.getDecorationID());
pstmt.setInt(6,bd.getNoOfPeople());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Booking Details Id is "+ rs.getInt(1);
		
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

	
public ArrayList<BookingDetails> 
getAllBookingDetails()

	{
		
ArrayList<BookingDetails>libd = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from BookingDetails";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int bdid =rs.getInt(1);

int bdmid =rs.getInt(2);
				
Date bddate=rs.getDate(3);

String bditem=rs.getString(4);
int bdfpid =rs.getInt(5);

int bddid =rs.getInt(6);
int bdnop =rs.getInt(7);

				
BookingDetails bd =new BookingDetails(bdid,bdmid,bddate,bditem,bdfpid,bddid,bdnop);
				
libd.add(bd);
				
				
			
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
return libd;	
}

	}


