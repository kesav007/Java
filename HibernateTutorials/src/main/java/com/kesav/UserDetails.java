package com.kesav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue
	private int userId;
	/** @Transient // annotation used for not saving to the database */
	private String userName;

	@Temporal(TemporalType.DATE) // annotation for to save only date
	private Date joinedDate;

	/*-
	 * Made the the variable name as listOfAddress, Try Set vs List
	 * If @JoinTable not provided, Hibernate will generate for you
	 * If @JoinColumn not provided, Hibernate will generate for you 
	 * Hashset doesn't provide index 
	 * ArrayList provides index i.e used for primary keys in USER_ADDRESS 
	 * HiLo doesn't support Oracle for Oracle its Seqhilo
	 */
	@ElementCollection
	@JoinTable(name = "USER_ADDRESS", joinColumns = @JoinColumn(name = "USER_ID"))
	@GenericGenerator(strategy = "seqhilo", name = "hilo-gen")
	@CollectionId(columns = { @Column(name = "ADDRESS_ID") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<Address> listOfAddresses = new ArrayList<Address>();
	/** @Lob Lob datatype */
	private String description;

	public String getDescription() {
		return description;
	}

	public Date getJoinedDate() {
		return joinedDate;
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

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Collection<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(Collection<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

}
