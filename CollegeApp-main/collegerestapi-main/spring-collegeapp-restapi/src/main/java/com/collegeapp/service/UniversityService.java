package com.collegeapp.service;

import java.util.List;

import com.collegeapp.models.University;

public interface UniversityService {
	
	void addUniversity(University university);
	void updateUniversity(University university);
	University getUniversityById(int universityId);
	void deleteUniversity(int universityId);
	
	List<University> getUniversityBycity(String city);
	List<University> getUniversityBycollege(String collegeName);
//	List<University> getUniversityByLocation(String location);
	

}
