package com.formacion.iteracionAPP.dto.model;

public enum Status {
	OK ("ok"),
	FAIL("Fail!");
	
	
	private final String description;
	
	Status (String description) {
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
}
