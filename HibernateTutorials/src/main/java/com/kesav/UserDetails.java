package com.kesav;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "street", column = @Column(name = "HOME_STREET_NAME")),
			@AttributeOverride(name = "city", column = @Column(name = "HOME_CITY_NAME")),
			@AttributeOverride(name = "state", column = @Column(name = "HOME_STATE_NAME")),
			@AttributeOverride(name = "zipcode", column = @Column(name = "HOME_ZIPCODE")) })
	private Address homeAddress;
	@Embedded
	private Address officeAddress;
	// @Lob // Lob datatype
	private String description;

	public String getDescription() {
		return description;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public int getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
