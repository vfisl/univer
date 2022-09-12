package com.collegeapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegeapp.models.College;
import com.collegeapp.repository.CollegeRepository;

@Transactional
@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeRepository collegeRepository;

	@Override
	public void addCollege(College college) {
	   collegeRepository.save(college);
		
	}

	@Override
	public void updateCollege(College college) {
		collegeRepository.save(college);
		
	}

	@Override
	public College getCollegeById(int collegeId) {
		
		return collegeRepository.findById(collegeId).get();
	}

	@Override
	public void deleteCollege(int collegeId) {
		collegeRepository.deleteById(collegeId);
		
	}

	@Override
	public List<College> getCollegeByCity(String city) {
		// TODO Auto-generated method stub
		return collegeRepository.findByAddressCity(city);
	}

	@Override
	public List<College> getCollegeByUniversity(String universityName) {
		// TODO Auto-generated method stub
		return collegeRepository.getCollegeByUniversity(universityName);
	}

	@Override
	public List<College> getCollegeByDepartment(String departmentName) {
		// TODO Auto-generated method stub
		return collegeRepository.getCollegeByDepartment(departmentName);
	}

	@Override
	public List<College> getCollegeByLocation(String location) {
		// TODO Auto-generated method stub
		return collegeRepository.findByAddressStreetName(location);
	}

}
