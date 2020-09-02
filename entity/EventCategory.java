package com.entity;


public class EventCategory {

	private int EventCatID;

	private String EventCatName;

	private String Logo;

	public EventCategory() {
		super();
	}

	public EventCategory(String eventCatName, String logo) {
		super();
		EventCatName = eventCatName;
		Logo = logo;
	}

	public EventCategory(int eventCatID, String eventCatName, String logo) {
		super();
		EventCatID = eventCatID;
		EventCatName = eventCatName;
		Logo = logo;
	}

	public int getEventCatID() {
		return EventCatID;
	}

	public void setEventCatID(int eventCatID) {
		EventCatID = eventCatID;
	}

	public String getEventCatName() {
		return EventCatName;
	}

	public void setEventCatName(String eventCatName) {
		EventCatName = eventCatName;
	}

	public String getLogo() {
		return Logo;
	}

	public void setLogo(String logo) {
		Logo = logo;
	}
	

	

}

