package com.collegeapp.service;

import java.util.List;

import com.collegeapp.models.College;

public interface CollegeService {
	  
	void addCollege(College college);
	void updateCollege(College college);
	College getCollegeById(int collegeId);
	void deleteCollege(int collegeId);
	
	
	List<College> getCollegeByCity(String city);
	List<College> getCollegeByUniversity(String universityName);
	List<College> getCollegeByDepartment(String departmentName);
	List<College> getCollegeByLocation(String location);

}
