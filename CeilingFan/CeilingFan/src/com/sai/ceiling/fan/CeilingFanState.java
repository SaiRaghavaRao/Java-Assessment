package com.sai.ceiling.fan;

public enum CeilingFanState {

	OFF("Off", "turned Off"), 
	SPEED_1("Speed1", "running at speed 1"), 
	SPEED_2("Speed2", "running at speed 2"),
	SPEED_3("Speed3", "running at speed 3");

	private final String name;
	private final String description;
	
	CeilingFanState(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public CeilingFanState getNextState() {
		CeilingFanState[] values = values();
		return values[(ordinal() + 1) % values.length];
	}

}
