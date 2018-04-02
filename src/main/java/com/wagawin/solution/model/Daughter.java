package com.wagawin.solution.model;

import javax.persistence.Entity;

@Entity
public class Daughter extends Child {

	String hairColor;

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}

	
}
