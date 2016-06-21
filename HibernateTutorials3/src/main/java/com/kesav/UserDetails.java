package com.kesav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "user_detail")
public class UserDetails {

	@Id
	@GeneratedValue
	private int user_id;

	@Column(name = "user_name")
	private String userName;

	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "intx_company") , name = "companyName"),
			@AttributeOverride(column = @Column(name = "intx_designation") , name = "designation"),
			@AttributeOverride(column = @Column(name = "intx_joinDate") , name = "joinDate") })
	private Company intx;

	@AttributeOverrides({ @AttributeOverride(column = @Column(name = "usc_company") , name = "companyName"),
			@AttributeOverride(column = @Column(name = "usc_designation") , name = "designation"),
			@AttributeOverride(column = @Column(name = "usc_joinDate") , name = "joinDate") })
	private Company usc;

	@ElementCollection
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id") )
	@GenericGenerator(strategy = "seqhilo", name = "hilo-gen")
	@CollectionId(columns = { @Column(name = "address_id") }, generator = "hilo-gen", type = @Type(type = "long") )
	private List<Address> listOfAddresses = new ArrayList<Address>();

	@ElementCollection
	@JoinTable(name = "user_book", joinColumns = @JoinColumn(name = "user_id") )
	private Set<Book> setOfBooks = new HashSet<Book>();

	@OneToOne
	@JoinColumn(name = "personal_id")
	private PersonalInfo personalInfo;

	@OneToMany
	@JoinTable(name = "user_watch", joinColumns = @JoinColumn(name = "user_id") , inverseJoinColumns = @JoinColumn(name = "watch_id") )
	private Collection<Watch> watches = new ArrayList<Watch>();

	@OneToMany(mappedBy = "user")
	private Collection<Sunglass> sunglass = new ArrayList<Sunglass>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private Collection<Laptop> laptop = new ArrayList<Laptop>();

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<Address> getListOfAddresses() {
		return listOfAddresses;
	}

	public void setListOfAddresses(List<Address> listOfAddresses) {
		this.listOfAddresses = listOfAddresses;
	}

	public Set<Book> getSetOfBooks() {
		return setOfBooks;
	}

	public void setSetOfBooks(Set<Book> setOfBooks) {
		this.setOfBooks = setOfBooks;
	}

	public Company getUsc() {
		return usc;
	}

	public void setUsc(Company usc) {
		this.usc = usc;
	}

	public Company getIntx() {
		return intx;
	}

	public void setIntx(Company intx) {
		this.intx = intx;
	}

	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}

	public Collection<Watch> getWatches() {
		return watches;
	}

	public void setWatches(Collection<Watch> watches) {
		this.watches = watches;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public Collection<Sunglass> getSunglass() {
		return sunglass;
	}

	public void setSunglass(Collection<Sunglass> sunglass) {
		this.sunglass = sunglass;
	}

	public Collection<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(Collection<Laptop> laptop) {
		this.laptop = laptop;
	}

}