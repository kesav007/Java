package com.kesav;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue
	private int userId;
	// @Transient // annotation used for not saving to the database
	private String userName;
	@Temporal(TemporalType.DATE) // annotation for to save only date
	private Date joinedDate;
	private Address address;

	// @Lob // Lob datatype
	private String description;

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public String getDescription() {
		return description;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
