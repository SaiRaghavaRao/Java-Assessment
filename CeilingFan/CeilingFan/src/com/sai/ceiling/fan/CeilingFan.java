package com.sai.ceiling.fan;

import java.util.Calendar;

public class CeilingFan {

	CeilingFanState ceilingFanState = CeilingFanState.OFF;
	FanDirection fanDirection = FanDirection.NORMAL;

	public void pullFanSpeedCord() {
		if (shouldFanRun()) {
			ceilingFanState = ceilingFanState.getNextState();
		} else {
			ceilingFanState = CeilingFanState.OFF;
		}
		printState();
	}

	public void pullFanDirectionCord() {
		if (shouldFanRun()) {
			fanDirection = fanDirection == FanDirection.NORMAL ? FanDirection.REVERSE : FanDirection.NORMAL;
		}
		printState();
	}

	private void printState() {
		System.out.println("Fan is " + ceilingFanState.getDescription()
				+ (ceilingFanState != CeilingFanState.OFF ? " in " + fanDirection.getName() : ""));
	}

	private boolean shouldFanRun() {
		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH); // Jan = 0, dec = 11
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		if (month == 11 && dayOfMonth == 25) {
			return false;
		}
		return true;
	}

}
