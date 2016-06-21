package com.keshav;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int id;

	@Column(name = "user_name")
	private String username;

	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dob;

	private String description;

	@Transient
	private String waste;

	@AttributeOverrides({ @AttributeOverride(name = "favorite_thing", column = @Column(name = "Food")),
			@AttributeOverride(name = "favorite_desc", column = @Column(name = "Restaurant")) })
	private Favorite food;

	@AttributeOverrides({ @AttributeOverride(name = "favorite_thing", column = @Column(name = "Movie")),
			@AttributeOverride(name = "favorite_desc", column = @Column(name = "Hero")) })
	private Favorite movie;

	@ElementCollection
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"))
	@GenericGenerator(name = "hi-lo", strategy = "seqhilo")
	@CollectionId(columns = @Column(name = "address_id"), generator = "hi-lo", type = @Type(type = "int"))
	private List<Address> addressList = new ArrayList<Address>();

	@ElementCollection
	@JoinTable(name = "user_watch", joinColumns = @JoinColumn(name = "user_id"))
	private Set<Watch> watchSet = new HashSet<Watch>();

	@OneToOne
	@JoinColumn(name = "spouse_id")
	private Spouse spouse;

	@OneToMany
	@JoinTable(name = "user_vehicle", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "vehicle_id"))
	private List<Vehicle> vehicles = new ArrayList<Vehicle>();

	@ManyToMany
	@JoinTable(name = "user_course", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "course_id"))
	private List<Course> courses = new ArrayList<Course>();

	public UserDetails() {
	}

	public UserDetails(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public Date getDob() {
		return dob;
	}

	public String getDescription() {
		return description;
	}

	public String getWaste() {
		return waste;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public Set<Watch> getWatchSet() {
		return watchSet;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setWaste(String waste) {
		this.waste = waste;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public void setWatchSet(Set<Watch> watchSet) {
		this.watchSet = watchSet;
	}

	public Favorite getMovie() {
		return movie;
	}

	public void setMovie(Favorite movie) {
		this.movie = movie;
	}

	public Favorite getFood() {
		return food;
	}

	public void setFood(Favorite food) {
		this.food = food;
	}

	public Spouse getSpouse() {
		return spouse;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

}
