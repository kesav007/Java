package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Vehicle {

	@Id
	// @GenericGenerator(name = "vehicle", strategy = "sequence")
	@GeneratedValue
	private int vechile_id;
	private String vechile_name;

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetails user;

	public Vehicle() {
	}

	public Vehicle(String vechile_name) {
		this.vechile_name = vechile_name;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}
}
