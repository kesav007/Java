package com.keshav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Spouse {

	@Id
	@GeneratedValue
	private int spouse_id;
	private String first_name;
	private String last_name;

	@OneToOne
	@JoinColumn(name = "user_id")
	private UserDetails userDetails;

	public Spouse() {
	}

	public Spouse(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
	}

	public int getSpouse_id() {
		return spouse_id;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}
