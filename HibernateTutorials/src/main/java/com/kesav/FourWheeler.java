package com.kesav;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "Car")
public class FourWheeler extends Vehicle2 {
	private String steeringwheel;

	public String getSteeringwheel() {
		return steeringwheel;
	}

	public void setSteeringwheel(String steeringwheel) {
		this.steeringwheel = steeringwheel;
	}
}
