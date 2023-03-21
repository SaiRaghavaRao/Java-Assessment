package com.sai.ceiling.fan;

public enum FanDirection {

	NORMAL("Normal Direction"),
	REVERSE("Reverse Direction");
	
	private final String name;
	
	FanDirection(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
}
