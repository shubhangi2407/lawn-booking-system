package com.entity;


public class Decorations 
{
	
private int DecorationID;

	private String DecorationType;
	

	public Decorations(){
	
	//TODO Auto-generated constructor stub
	
}

	
public Decorations(String decorationType)
 {
		
super();
	
	DecorationType = decorationType;

	}

	
public Decorations(int decorationID, String decorationType)
 {
		
super();

DecorationID = decorationID;
	
	DecorationType = decorationType;

	}

	
public int getDecorationID() {
	
	return DecorationID;

	}

	
public void setDecorationID(int decorationID) 
{
		
DecorationID = decorationID;
	
}

	
public String getDecorationType()
 {
		
return DecorationType;
	
}

	
public void setDecorationType(String decorationType)
 {
		
DecorationType = decorationType;

	}
	


}
