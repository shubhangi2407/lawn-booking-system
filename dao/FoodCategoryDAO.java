package com.dao;
import com.entity.FoodCategory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

public class FoodCategoryDAO{

   PreparedStatement pstmt=null;
   String msg="";
   
   MainDAO mdao=new MainDAO();
   public String addFoodCategory(FoodCategory fc){
     Connection con = mdao.connect();
   if(con!=null) {

try{
pstmt=con.prepareStatement("insert into foodcategory(FoodCategoryName) values(?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,fc.getFoodCategoryName());
pstmt.executeUpdate();

ResultSet rs=pstmt.getGeneratedKeys();

if(rs.next())
msg="Food Category ID is "+rs.getInt(1);

pstmt.close();
con.close();
msg="ok";
}

catch(SQLException e){
e.printStackTrace();
msg=e.toString();
}
}

else{
System.out.println("Connection is null !");
msg="Connection is null !";
}

return msg;
}

/*
public String deleteFoodCategory(FoodCategoryfc){
Connection con= mdao.connect();

if(con!=null){

try{
pstmt=con.prepareStatement("delete from foodcategory", Statement.RETURN_GENERATED_KEYS);
pstmt.executeUpdate();

ResultSet rs=pstmt.getGeneratedKeys();

if(rs.next())
msg="Food Category ID is"+rs.getInt(1);

pstmt.close();
con.close();
msg="ok";
}
catch(SQLException e){
e.printStackTrace(;
msg=e.toString();
}
}
else{
System.out.println("Connection is null !");
msg="Connection is null !";
}
return msg;
}

*/

public ArrayList<FoodCategory> getAllFoodCategory()
{

ArrayList<FoodCategory> lifc=new ArrayList<>();
Connection con =mdao.connect();
if(con!=null)
{
try{
Statement stmt=con.createStatement();
String q="Select * from foodcategory";
ResultSet rs=stmt.executeQuery(q);
while(rs.next())
{
int fcid=rs.getInt(1);
String fcname=rs.getString(2);
FoodCategory fc=new FoodCategory(fcid,fcname);
lifc.add(fc);

}

rs.close();
stmt.close();
con.close();
}
catch(SQLException e){
e.printStackTrace();
}
}

return lifc;
}
}
