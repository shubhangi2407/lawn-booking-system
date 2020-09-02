package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;


import java.sql.Statement;

import java.sql.Connection;


import com.entity.FoodPackages;


public class FoodPackageDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addFoodPackages(FoodPackages fp)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into FoodPackages(FoodPackageName,NoOfWelcomeDrinks,Soup,Salad,Starters,NoOfPaneerVeg,NoOfOtherVeg,Rice,Dal,Roti,Miscellaneous,Rate) values(?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,fp.getFoodPackageName());
pstmt.setInt(2,fp.getNoOfWelcomeDrinks());
pstmt.setInt(3,fp.getSoup());
pstmt.setInt(4,fp.getSalad());
pstmt.setInt(5,fp.getStarters());
pstmt.setInt(6,fp.getNoOfPaneerVeg());
pstmt.setInt(7,fp.getNoOfOtherVeg());
pstmt.setInt(8,fp.getRice());
pstmt.setInt(9,fp.getDal());
pstmt.setInt(10,fp.getRoti());
pstmt.setInt(11,fp.getMiscellaneous());
pstmt.setInt(12,fp.getRate());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Food Package Id is "+ rs.getInt(1);
		
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

	
public ArrayList<FoodPackages> 
getAllFoodPackage()

	{
		
ArrayList<FoodPackages>lis = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from FoodPackage";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int fpid =rs.getInt(1);
	
String fpname=rs.getString(2);
int fpnowd=rs.getInt(3);
int fpsoup=rs.getInt(4);
int fpsalad=rs.getInt(5);
int fpstarters=rs.getInt(6);
int fpnopv=rs.getInt(7);
int fpnoov=rs.getInt(8);
int fprice=rs.getInt(9);
int fpdal=rs.getInt(10);
int fproti=rs.getInt(11);
int fpmi=rs.getInt(12);
int fprate=rs.getInt(13);
FoodPackages fp =new FoodPackages(fpid,fpname,fpnowd,fpsoup,fpsalad, fpstarters,fpnopv,fpnoov,fprice,fpdal,fproti,fpmi,fprate);
				
lis.add(fp);
				
				
			
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
return lis;	
}

}

