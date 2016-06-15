package com.kesav;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Computer {

	@Id
	@GeneratedValue
	@Column(name="computer_id")
	private int computerid;
	@Column(name="computer_name")
	private String computername;
	
	@ManyToOne
	private UserDetails user;

	public Computer() {
	}

	public Computer(String computername, UserDetails user) {
		this.computername = computername;
		this.user = user;
	}

}
