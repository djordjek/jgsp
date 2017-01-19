package com.jgsp.model.enumeration;

public enum Type {
	
	GRADSKI ("rvg", "Gradski"),
    PRIGRADSKI   ("rvp", "Prigradski");
	
	private String typeId;
	private String name;
	
	
	private Type(String typeId, String name) {
		this.typeId = typeId;
		this.name = name;
	}

	public String getTypeId() {
		return typeId;
	}


	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

}
