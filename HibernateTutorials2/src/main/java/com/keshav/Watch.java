package com.keshav;

import javax.persistence.Embeddable;

@Embeddable
public class Watch {

	private String watch_name;
	private String watch_model;

	public Watch() {
	}

	public Watch(String watch_name, String watch_model) {
		this.watch_name = watch_name;
		this.watch_model = watch_model;
	}

}
