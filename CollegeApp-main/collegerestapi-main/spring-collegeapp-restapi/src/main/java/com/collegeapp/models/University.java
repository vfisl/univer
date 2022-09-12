package com.collegeapp.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class University {
	
	@Id
	@GeneratedValue(generator = "uni_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "uni_id", sequenceName = "university_id")
	
	private Integer universityId;
	private String universityName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "university_id")
	private Set<College>college;
	public University() {
		super();
		// TODO Auto-generated constructor stub
	}
	public University(String universityName, Address address, Set<College> college) {
		super();
		this.universityName = universityName;
		this.address = address;
		this.college = college;
	}
	public Integer getUniversityId() {
		return universityId;
	}
	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Set<College> getCollege() {
		return college;
	}
	public void setCollege(Set<College> college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "University [universityName=" + universityName + ", address=" + address + ", college=" + college + "]";
	}

}  
