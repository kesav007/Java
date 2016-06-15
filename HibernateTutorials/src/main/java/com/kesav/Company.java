package com.kesav;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Company {

	@Column(name = "company_name")
	private String name;
	private String designation;

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", designation=" + designation + "]";
	}

}
