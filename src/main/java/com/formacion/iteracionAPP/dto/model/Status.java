package com.formacion.iteracionAPP.dto.model;

public enum Status {
	OK ("ok"),
	FAIL("Fail!"),
	NOT_FOUND("Not found!");
	
	
	private final String description;
	
	Status (String description) {
		this.description = description;
	}
	
	public String getDescription(){
		return this.description;
	}
}
