package com.kesav;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Computer {

	@Id
	@GeneratedValue
	@Column(name = "computer_id")
	private int computerid;
	@Column(name = "computer_name")
	private String computername;

	public Computer(String computername) {
		this.computername = computername;
	}	

}
