package com.kesav;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Pantu")
public class Pant extends Dress {

	@Column(name="pant_type")
	private String pantType;

	public Pant() {
	}

	public Pant(String cloth, String pantType) {
		super(cloth);
		this.pantType = pantType;
	}

}
