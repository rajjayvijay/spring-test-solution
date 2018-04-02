package com.wagawin.solution.model;

import javax.persistence.Entity;

@Entity
public class Son extends Child {

	public String getBicycleColor() {
		return bicycleColor;
	}

	public void setBicycleColor(String bicycleColor) {
		this.bicycleColor = bicycleColor;
	}

	String bicycleColor;

}
