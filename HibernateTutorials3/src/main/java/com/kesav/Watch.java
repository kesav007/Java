package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Watch {

	@Id
	@GeneratedValue
	private int watch_id;
	private String brand;
	private Integer price;

	public Watch() {
	}

	public Watch(String brand, Integer price) {
		this.brand = brand;
		this.price = price;
	}

}
