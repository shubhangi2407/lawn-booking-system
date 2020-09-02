package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Statement;

import java.sql.Connection;


import com.entity.PeakDates;


public class PeakDatesDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addPeakDates(PeakDates pd)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into PeakDates (PeakDate values(?)", Statement.RETURN_GENERATED_KEYS);

java.sql.Date d1 = new java.sql.Date(pd.getPeakDate().getTime());
pstmt.setDate(1,  d1);


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Peak Date Id is "+ rs.getInt(1);
		
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

	
public ArrayList<PeakDates> 
getAllPeakDates()

	{
		
ArrayList<PeakDates>lipd = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from PeakDates";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int pdid =rs.getInt(1);


Date pdpdate=rs.getDate(2);

PeakDates pd =new PeakDates(pdid,pdpdate);
				
lipd.add(pd);
				
				
			
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

return lipd;	
}

}

