package com.kesav;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bushirt")
public class Shirt extends Dress {

	public String shirtType;

	public Shirt() {
		// TODO Auto-generated constructor stub
	}

	public Shirt(String cloth, String shirtType) {
		super(cloth);
		this.shirtType = shirtType;
	}

}
