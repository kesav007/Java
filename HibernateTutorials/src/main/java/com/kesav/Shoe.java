package com.kesav;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

// Many to One Relation
@Entity
public class Shoe {

	@Id
	@GeneratedValue
	private int shoe_id;

	private String shoeBrand;

	@ManyToOne
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinTable(name = "user_shoe", joinColumns = @JoinColumn(name = "shoe_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	private UserDetails user;

	public Shoe() {
		// TODO Auto-generated constructor stub
	}

	public Shoe(String shoeBrand) {
		this.shoeBrand = shoeBrand;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

}
