package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {

	@Id
	@GeneratedValue
	private int id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	UserDetails user = new UserDetails();

	private String brand;
	private Integer price;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(String brand, Integer price) {
		this.brand = brand;
		this.price = price;
	}

}
