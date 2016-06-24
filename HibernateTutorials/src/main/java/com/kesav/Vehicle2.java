package com.kesav;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "vehicle_type")
@DiscriminatorValue(value = "Vehicle")
public class Vehicle2 {
	@Id
	@GeneratedValue
	private int vechile_id;
	private String vechile_name;

	public int getVechile_id() {
		return vechile_id;
	}

	public String getVechile_name() {
		return vechile_name;
	}

	public void setVechile_name(String vechile_name) {
		this.vechile_name = vechile_name;
	}

	public void setVechile_id(int vechile_id) {
		this.vechile_id = vechile_id;
	}

}
