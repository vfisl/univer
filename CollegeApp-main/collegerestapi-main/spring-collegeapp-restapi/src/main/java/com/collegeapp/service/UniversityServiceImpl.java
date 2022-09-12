package com.collegeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.models.University;
import com.collegeapp.repository.UniversityRepository;
@Service
public class UniversityServiceImpl implements UniversityService {
	@Autowired
	UniversityRepository universityRepository;

	@Override
	public void addUniversity(University university) {
	    universityRepository.save(university);
		
	}

	@Override
	public void updateUniversity(University university) {
		universityRepository.save(university);
		
	}

	@Override
	public University getUniversityById(int universityId) {
		
		return universityRepository.findById(universityId).get();
	}

	@Override
	public void deleteUniversity(int universityId) {
		universityRepository.deleteById(universityId);
		
	}

	@Override
	public List<University> getUniversityBycity(String city) {
		
		return universityRepository.findByAddressCity(city);
	}

	@Override
	public List<University> getUniversityBycollege(String collegeName) {
		
		return universityRepository.findByCollegeCollegeName(collegeName);
	}

//	@Override
//	public List<University> getUniversityByLocation(String location) {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
