package com.jgsp.model.enumeration;

public enum Direction {
	
	A ("A"),
    B ("B");
	
	private String directionName;
	
	
	private Direction(String directionName) {
		this.directionName = directionName;
	}

	public String getDirectionName() {
		return directionName;
	}


	public void setDirectionName(String directionName) {
		this.directionName = directionName;
	}
	
	

}
