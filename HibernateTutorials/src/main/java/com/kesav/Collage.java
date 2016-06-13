package com.kesav;

import javax.persistence.Embeddable;

@Embeddable
public class Collage {

	private String collageName;

	public Collage() {
	}

	public Collage(String collageName) {
		this.collageName = collageName;
	}

}
