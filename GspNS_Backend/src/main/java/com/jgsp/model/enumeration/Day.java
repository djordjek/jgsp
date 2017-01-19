package com.jgsp.model.enumeration;

public enum Day {
	
	RADNI ("R", "Radni"),
    SUBOTA   ("S", "Subota"),
    NEDELJA   ("N", "Nedelja");
	
	private String dayId;
	private String name;
	
	
	private Day(String dayId, String name) {
		this.dayId = dayId;
		this.name = name;
	}

	public String getDayId() {
		return dayId;
	}


	public void setDayId(String dayId) {
		this.dayId = dayId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
