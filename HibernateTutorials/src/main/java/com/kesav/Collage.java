package com.kesav;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Collage {

	@Column(name="collage_name")
	private String collageName;

	public Collage() {
	}

	public Collage(String collageName) {
		this.collageName = collageName;
	}

}
