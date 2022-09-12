package com.collegeapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Department {
	@Id
	@GeneratedValue(generator = "department_id", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "department_id", sequenceName = "department_id")
	private Integer departmentId;
	private String  departmentName;
	private String  departmentHead;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName, String departmentHead) {
		super();
		this.departmentName = departmentName;
		this.departmentHead = departmentHead;
	}
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentHead() {
		return departmentHead;
	}
	public void setDepartmentHead(String departmentHead) {
		this.departmentHead = departmentHead;
	}
	@Override
	public String toString() {
		return "Department [departmentName=" + departmentName + ", departmentHead=" + departmentHead + "]";
	}

}
