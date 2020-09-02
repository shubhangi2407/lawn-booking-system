package com.entity;
public class FoodCategory{

private int FoodCategoryID;
private String FoodCategoryName;
public FoodCategory() {
	super();
}
public FoodCategory(String foodCategoryName) {
	super();
	FoodCategoryName = foodCategoryName;
}
public FoodCategory(int foodCategoryID, String foodCategoryName) {
	super();
	FoodCategoryID = foodCategoryID;
	FoodCategoryName = foodCategoryName;
}
public int getFoodCategoryID() {
	return FoodCategoryID;
}
public void setFoodCategoryID(int foodCategoryID) {
	FoodCategoryID = foodCategoryID;
}
public String getFoodCategoryName() {
	return FoodCategoryName;
}
public void setFoodCategoryName(String foodCategoryName) {
	FoodCategoryName = foodCategoryName;
}



}
