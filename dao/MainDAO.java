package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MainDAO{
Connection con =null;
public Connection connect()
{
try{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver Loaded");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","");
System.out.println("Connected....");
   }
catch(ClassNotFoundException e){
//TODO Auto-generated catch block
e.printStackTrace();
}catch(SQLException e){
//TODO Auto-generated catch block
e.printStackTrace();
}
return con;
}
}

