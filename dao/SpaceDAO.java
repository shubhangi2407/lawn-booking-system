package com.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;


import java.sql.Statement;



import com.entity.Space;


public class SpaceDAO
{
	
	
PreparedStatement pstmt = null;
	
String msg ="";
	
MainDAO mdao = new MainDAO();
	
public String addSpace(Space s)
	
{
	
Connection con = mdao.connect();
	
	
if(con!=null)
	
{
		
try
		
{
		
pstmt=con.prepareStatement("insert into space(SpaceName,Type,StageSize,Chairs,Tables,WeddingChairs,SpeakerMic,Mattresses,Carpet,Halogens,NoOfRooms,LBPerUnit,Area) values(?,?,?,?,?,?,?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
pstmt.setString(1,s.getSpaceName());
pstmt.setString(2,s.getType());
pstmt.setString(3,s.getStageSize());
pstmt.setInt(4,s.getChairs());
pstmt.setInt(5,s.getTables());
pstmt.setInt(6,s.getWeddingChairs());
pstmt.setInt(7,s.getSpeakerMic());
pstmt.setInt(8,s.getMattresses());
pstmt.setInt(9,s.getCarpet());
pstmt.setInt(10,s.getHalogens());
pstmt.setInt(11,s.getNoOfRooms());
pstmt.setInt(12,s.getLBPerUnit());
pstmt.setInt(13,s.getArea());


pstmt.executeUpdate();
		
		
ResultSet rs = pstmt.getGeneratedKeys();
		
		
if(rs.next())
			
msg="Space Id is "+ rs.getInt(1);
		
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

	
public ArrayList<Space> 
getAllSpace()

	{
		
ArrayList<Space>lis = new ArrayList<>();
		
Connection con = mdao.connect();
		
if(con!=null)
		
{
	
try
{
		
			
Statement stmt =con.createStatement();
			
String q ="Select * from Space";
			
ResultSet rs = stmt.executeQuery(q);
			
while(rs.next())
			
{
				
int sid =rs.getInt(1);
	
String sname=rs.getString(2);
String stype=rs.getString(3);
String sstagesize=rs.getString(4);
int sc=rs.getInt(5);
int st=rs.getInt(6);
int swc=rs.getInt(7);
int ssm=rs.getInt(8);
int sm=rs.getInt(9);
int sca=rs.getInt(10);
int sh=rs.getInt(11);
int snor=rs.getInt(12);
int slbpu=rs.getInt(13);
int sa=rs.getInt(14);
Space s =new Space(sid,sname,stype,sstagesize,sc,st,swc,ssm,sm,sca,sh,snor,slbpu,sa);
				
lis.add(s);
				
				
			
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

