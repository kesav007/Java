package com.keshav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int course_id;

	private String name;

	public Course() {
	}

	public Course(String name) {
		this.name = name;
	}

}
