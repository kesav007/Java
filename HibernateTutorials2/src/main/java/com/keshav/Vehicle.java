package com.keshav;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "vehicle_id")
	private int id;

	@Column(name = "make_model")
	private String makeAndModel;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	public String getMakeAndModel() {
		return makeAndModel;
	}

	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

}
