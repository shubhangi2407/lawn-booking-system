package com.entity;


public class FoodPackages 
{

private int FoodPackageID;

private String FoodPackageName;

private int NoOfWelcomeDrinks;

private int Soup;

private int Salad;

private int Starters;

private int NoOfPaneerVeg;

private int NoOfOtherVeg;

private int Rice;

private int Dal;

private int Roti;

private int Miscellaneous;

private int Rate;

public FoodPackages() {
	super();
}

public FoodPackages(String foodPackageName, int noOfWelcomeDrinks, int soup, int salad, int starters, int noOfPaneerVeg,
		int noOfOtherVeg, int rice, int dal, int roti, int miscellaneous, int rate) {
	super();
	FoodPackageName = foodPackageName;
	NoOfWelcomeDrinks = noOfWelcomeDrinks;
	Soup = soup;
	Salad = salad;
	Starters = starters;
	NoOfPaneerVeg = noOfPaneerVeg;
	NoOfOtherVeg = noOfOtherVeg;
	Rice = rice;
	Dal = dal;
	Roti = roti;
	Miscellaneous = miscellaneous;
	Rate = rate;
}

public FoodPackages(int foodPackageID, String foodPackageName, int noOfWelcomeDrinks, int soup, int salad, int starters,
		int noOfPaneerVeg, int noOfOtherVeg, int rice, int dal, int roti, int miscellaneous, int rate) {
	super();
	FoodPackageID = foodPackageID;
	FoodPackageName = foodPackageName;
	NoOfWelcomeDrinks = noOfWelcomeDrinks;
	Soup = soup;
	Salad = salad;
	Starters = starters;
	NoOfPaneerVeg = noOfPaneerVeg;
	NoOfOtherVeg = noOfOtherVeg;
	Rice = rice;
	Dal = dal;
	Roti = roti;
	Miscellaneous = miscellaneous;
	Rate = rate;
}

public int getFoodPackageID() {
	return FoodPackageID;
}

public void setFoodPackageID(int foodPackageID) {
	FoodPackageID = foodPackageID;
}

public String getFoodPackageName() {
	return FoodPackageName;
}

public void setFoodPackageName(String foodPackageName) {
	FoodPackageName = foodPackageName;
}

public int getNoOfWelcomeDrinks() {
	return NoOfWelcomeDrinks;
}

public void setNoOfWelcomeDrinks(int noOfWelcomeDrinks) {
	NoOfWelcomeDrinks = noOfWelcomeDrinks;
}

public int getSoup() {
	return Soup;
}

public void setSoup(int soup) {
	Soup = soup;
}

public int getSalad() {
	return Salad;
}

public void setSalad(int salad) {
	Salad = salad;
}

public int getStarters() {
	return Starters;
}

public void setStarters(int starters) {
	Starters = starters;
}

public int getNoOfPaneerVeg() {
	return NoOfPaneerVeg;
}

public void setNoOfPaneerVeg(int noOfPaneerVeg) {
	NoOfPaneerVeg = noOfPaneerVeg;
}

public int getNoOfOtherVeg() {
	return NoOfOtherVeg;
}

public void setNoOfOtherVeg(int noOfOtherVeg) {
	NoOfOtherVeg = noOfOtherVeg;
}

public int getRice() {
	return Rice;
}

public void setRice(int rice) {
	Rice = rice;
}

public int getDal() {
	return Dal;
}

public void setDal(int dal) {
	Dal = dal;
}

public int getRoti() {
	return Roti;
}

public void setRoti(int roti) {
	Roti = roti;
}

public int getMiscellaneous() {
	return Miscellaneous;
}

public void setMiscellaneous(int miscellaneous) {
	Miscellaneous = miscellaneous;
}

public int getRate() {
	return Rate;
}

public void setRate(int rate) {
	Rate = rate;
}



}
