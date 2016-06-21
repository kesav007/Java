package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sunglass {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	UserDetails user = new UserDetails();

	private String brand;
	private Integer price;

	public Sunglass() {
	}

	public Sunglass(String brand, Integer price) {
		this.brand = brand;
		this.price = price;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

}
