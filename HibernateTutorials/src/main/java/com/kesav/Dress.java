package com.kesav;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dress_type", discriminatorType = DiscriminatorType.STRING)
public class Dress {

	@Id
	@GeneratedValue
	private int id;
	private String cloth;

	public Dress() {
	}

	public Dress(String cloth) {
		this.cloth = cloth;
	}

}
