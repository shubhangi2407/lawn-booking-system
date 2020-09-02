package com.entity;




public class Space {

	private int SpaceID;

	private String SpaceName;

	private String Type;
	
        private String StageSize;
	
        private int Chairs;

	private int Tables;

	private int WeddingChairs;

	private int SpeakerMic;

	private int Mattresses;

	private int Carpet;

	private int Halogens;

	private int NoOfRooms;

	private int LBPerUnit;

	private int Area;
	

	public Space(){
	
	//TODO Auto-generated constructor stub
	}


	public Space(String spaceName, String type, String stageSize, int chairs, int tables, int weddingChairs,
int speakerMic, int mattresses, int carpet, int halogens, int noOfRooms, int lBPerUnit, int area) 
{
	
	super();

		SpaceName = spaceName;
	
	Type = type;
	
	StageSize = stageSize;

	Chairs = chairs;

	Tables = tables;

	WeddingChairs = weddingChairs;
	
	SpeakerMic = speakerMic;
	
	Mattresses = mattresses;

	Carpet = carpet;

	Halogens = halogens;
	
	NoOfRooms = noOfRooms;
	
	LBPerUnit = lBPerUnit;
	
	Area = area;

	}

	
public Space(int spaceID, String spaceName, String type, String stageSize, int chairs, int tables, int weddingChairs,
int speakerMic, int mattresses, int carpet, int halogens, int noOfRooms, int lBPerUnit, int area) {
	
	super();

		SpaceID = spaceID;

		SpaceName = spaceName;
	
	Type = type;
		
StageSize = stageSize;
	
	Chairs = chairs;

	Tables = tables;

	WeddingChairs = weddingChairs;
	
	SpeakerMic = speakerMic;
	
	Mattresses = mattresses;
	
	Carpet = carpet;
		
        Halogens = halogens;
	
	NoOfRooms = noOfRooms;
	
	LBPerUnit = lBPerUnit;
	
	Area = area;
	
}

	
public int getSpaceID() {

		return SpaceID;

	}

	
public void setSpaceID(int spaceID) {
	
	SpaceID = spaceID;
	
}

	
public String getSpaceName() {
	
	return SpaceName;
	
}

	
public void setSpaceName(String spaceName) {
	
	SpaceName = spaceName;
	
}

	
public String getType() {

		return Type;

	}

	
public void setType(String type) {

		Type = type;
	
}

	
public String getStageSize() {

		return StageSize;

	}

	
public void setStageSize(String stageSize) {

		StageSize = stageSize;
	
}

	
public int getChairs() {

		return Chairs;

	}

	
public void setChairs(int chairs) {

		Chairs = chairs;

	}

	
public int getTables() {

		return Tables;

	}

	
public void setTables(int tables) {

		Tables = tables;

	}

	
public int getWeddingChairs() {
	
	return WeddingChairs;
	
}

	
public void setWeddingChairs(int weddingChairs) {

		WeddingChairs = weddingChairs;

	}

	
public int getSpeakerMic() {

		return SpeakerMic;

	}

	
public void setSpeakerMic(int speakerMic) {

		SpeakerMic = speakerMic;
	
}

	
public int getMattresses() {

		return Mattresses;

	}

	
public void setMattresses(int mattresses) {

		Mattresses = mattresses;

	}

	
public int getCarpet() {

		return Carpet;

	}

	
public void setCarpet(int carpet) {

		Carpet = carpet;

	}


	public int getHalogens() {

		return Halogens;

	}

	
public void setHalogens(int halogens) {
	
	Halogens = halogens;
	
}

	
public int getNoOfRooms()
 {
	
	return NoOfRooms;
	
}

	public void setNoOfRooms(int noOfRooms) {

		NoOfRooms = noOfRooms;
	
}

	
public int getLBPerUnit() 
{
		
return LBPerUnit;

	}

	
public void setLBPerUnit(int lBPerUnit) {

		LBPerUnit = lBPerUnit;
	
}

	
public int getArea() {

		return Area;
	
}

	
public void setArea(int area) {
	
	Area = area;
	
}




}
