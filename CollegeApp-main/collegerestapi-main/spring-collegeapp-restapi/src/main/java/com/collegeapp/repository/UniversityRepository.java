package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.collegeapp.models.University;


@Repository

public interface UniversityRepository extends JpaRepository<University, Integer> {
	
	List<University> findByUniversityName(String universityName);
	University findByUniversityId(String universityId);
	
	@Query("From University c inner join c.college u where u.collegeName=?1")
	 List<University> findByCollegeCollegeName(String collegeName);

	@Query("From University c inner join c.address u where u.city=?1")
	List<University>findByAddressCity(String city);
	

}
