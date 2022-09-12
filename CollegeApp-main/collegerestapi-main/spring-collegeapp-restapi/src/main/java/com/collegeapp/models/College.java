package com.collegeapp.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class College {
	@Id
	@GeneratedValue(generator = "college_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "college_id", sequenceName = "college_id")
	private Integer collegeId;
	private String collegeName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "college_id")
	private Set<Department>department;
	@ManyToOne()
	@JoinColumn(name = "university_id")
	private University university;
	
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String collegeName, Address address, Set<Department> department, University university) {
		super();
		this.collegeName = collegeName;
		this.address = address;
		this.department = department;
		this.university = university;
	}

	public Integer getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Department> getDepartment() {
		return department;
	}

	public void setDepartment(Set<Department> department) {
		this.department = department;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "College [collegeName=" + collegeName + ", address=" + address + ", department=" + department
				+ ", university=" + university + "]";
	}
	
}
