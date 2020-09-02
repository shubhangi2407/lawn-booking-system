package com.entity;




public class FoodItems
 {

private int FooditemID;

private int FoodCategoryID;

private String ItemName;


public FoodItems(){

	//TODO auto generated constructor stub

}

public FoodItems(int foodCategoryID, String itemName) {

	super();
	
FoodCategoryID = foodCategoryID;
	
ItemName = itemName;

}

public FoodItems(int fooditemID, int foodCategoryID, String itemName) {

	super();

	FooditemID = fooditemID;

	FoodCategoryID = foodCategoryID;
	
ItemName = itemName;

}

public int getFooditemID() 
{
	
return FooditemID;

}

public void setFooditemID(int fooditemID) {

	FooditemID = fooditemID;

}

public int getFoodCategoryID() {

	return FoodCategoryID;

}

public void setFoodCategoryID(int foodCategoryID) {

	FoodCategoryID = foodCategoryID;

}

public String getItemName() {

	return ItemName;

}

public void setItemName(String itemName) {

	ItemName = itemName;

}


}


