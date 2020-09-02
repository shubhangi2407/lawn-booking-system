package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;


import java.sql.Statement;

import java.sql.Connection;


import com.entity.Decorations;


public class DecorationsDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addDecorations(Decorations d)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into Decorations (DecorationType) values(?)" , Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,d.getDecorationType());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Decoration Id is "+ rs.getInt(1);
		
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

	
public ArrayList<Decorations> 
getAllDecorations()

	{
		
ArrayList<Decorations>lid = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from Decorations";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int did =rs.getInt(1);
	
String dtype=rs.getString(2);
Decorations d =new Decorations(did,dtype);
				
lid.add(d);
				
				
			
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

return lid;	
}

}

