package com.drone.entity;

public class Location {
	private String name;
	private int packageWeight;
	private boolean available;

	public Location(String name, int packageWeight) {
		this.name = name;
		this.packageWeight = packageWeight;
		this.available =  true;
	}

	public String getName() {
		return name;
	}

	public int getPackageWeight() {
		return packageWeight;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}