package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@Id
	// @GenericGenerator(name = "vehicle", strategy = "sequence")
	@GeneratedValue
	private int vechile_id;
	private String vechile_name;

	public Vehicle() {
	}

	public Vehicle(String vechile_name) {
		this.vechile_name = vechile_name;
	}

	public int getVechile_id() {
		return vechile_id;
	}

	public String getVechile_name() {
		return vechile_name;
	}

	public void setVechile_id(int vechile_id) {
		this.vechile_id = vechile_id;
	}

	public void setVechile_name(String vechile_name) {
		this.vechile_name = vechile_name;
	}
}
