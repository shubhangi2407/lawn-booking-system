package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;


import java.sql.Statement;

import java.sql.Connection;


import com.entity.FoodItems;


public class FoodItemsDAO {

	
	PreparedStatement pstmt = null;

	String msg ="";

	MainDAO mdao = new MainDAO();

	public String addFoodItems(FoodItems fi)
	{

	Connection con = mdao.connect();

	
	if(con!=null)
	{
	
	try{

		pstmt=con.prepareStatement("insert into fooditems (FoodCategoryID,ItemName) values(?,?)", Statement.RETURN_GENERATED_KEYS);

		pstmt.setInt(1,fi.getFoodCategoryID());
		pstmt.setString(2,fi.getItemName());

		pstmt.executeUpdate();
	
	
		ResultSet rs = pstmt.getGeneratedKeys();
	
	
		if(rs.next())
	
		 msg="Food Item Id is "+ rs.getInt(1);

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
	
else{
	
	System.out.println("Connection is null !");
	
	msg="Connection is null";

		
	}
	
return msg;

	
}


	public ArrayList<FoodItems> getAllFoodItems()
	{

		ArrayList<FoodItems>lifi = new ArrayList<>();
	
	Connection con = mdao.connect();

		if(con!=null)
		{

	try{
		

			Statement stmt =con.createStatement();
	
		String q ="Select * from FoodItems";
	
		ResultSet rs = stmt.executeQuery(q);
	
		while(rs.next())
	
		{
				
int fiid =rs.getInt(1);
	
			int ficid =rs.getInt(2);

				String finame=rs.getString(3);
	
			FoodItems fi =new FoodItems(fiid,ficid,finame);
	
			lifi.add(fi);


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
	
return lifi;

}

}
