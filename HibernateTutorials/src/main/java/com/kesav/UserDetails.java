package com.kesav;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;
	/** @Transient // annotation used for not saving to the database */
	private String userName;

	@Temporal(TemporalType.DATE) // annotation for to save only date
	private Date joinedDate;

	private Company company = new Company();

	/*-
	 * Made the the variable name as listOfAddress, Try Set vs List
	 * If @JoinTable not provided, Hibernate will generate for you
	 * If @JoinColumn not provided, Hibernate will generate for you 
	 * Hashset doesn't provide index 
	 * ArrayList provides index i.e used for primary keys in USER_ADDRESS 
	 * HiLo doesn't support Oracle for Oracle its Seqhilo
	 */
	@ElementCollection
	@JoinTable(name = "user_address", joinColumns = @JoinColumn(name = "user_id"))
	@GenericGenerator(strategy = "seqhilo", name = "hilo-gen")
	@CollectionId(columns = { @Column(name = "address_id") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<Address> listOfAddresses = new ArrayList<Address>();

	/*-
	* If @JoinTable not provided, Hibernate will generate for you, 
	* name will be USERDETAILS_LISTOFCOLLAGES
	* Fetch Type Eager will load the Collection of Objects when this object loads
	*/
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "user_collage", joinColumns = @JoinColumn(name = "user_id"))
	private Set<Collage> listOfCollages = new HashSet<Collage>();

	/** @Lob Lob datatype */
	private String description;

	@OneToOne
	@JoinColumn(name = "vechicle_id")
	private Vehicle vehicle;

	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinTable(name = "user_computer", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "computer_id"))
	private List<Computer> computers = new ArrayList<Computer>();

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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Set<Collage> getListOfCollages() {
		return listOfCollages;
	}

	public void setListOfCollages(Set<Collage> listOfCollages) {
		this.listOfCollages = listOfCollages;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List<Computer> getComputers() {
		return computers;
	}

	public void setComputers(List<Computer> computers) {
		this.computers = computers;
	}
}
