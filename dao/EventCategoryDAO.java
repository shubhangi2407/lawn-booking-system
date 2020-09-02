package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;



import java.sql.Statement;

import java.sql.Connection;


import com.entity.EventCategory;


public class EventCategoryDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addEventCategory(EventCategory ec)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into eventcategory (EventCatName,Logo) values(?,?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,ec.getEventCatName());
pstmt.setString(2,ec.getLogo());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Event Categeory Id is "+ rs.getInt(1);
		
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

	
public ArrayList<EventCategory> 
getAllEventCategeory()

	{
		
ArrayList<EventCategory>liec = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from EventCategeory";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int ecid =rs.getInt(1);
	
String ecname=rs.getString(2);
String eclogo=rs.getString(3);
EventCategory ec =new EventCategory(ecid,ecname,eclogo);
				
liec.add(ec);
				
				
			
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
return liec;	
}

}

