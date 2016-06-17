package com.keshav;

import javax.persistence.Embeddable;

@Embeddable
public class Favorite {

	private String favorite_thing;
	private String favorite_desc;

	public Favorite() {
	}

	public Favorite(String favorite_thing, String favorite_desc) {
		super();
		this.favorite_thing = favorite_thing;
		this.favorite_desc = favorite_desc;
	}

}
