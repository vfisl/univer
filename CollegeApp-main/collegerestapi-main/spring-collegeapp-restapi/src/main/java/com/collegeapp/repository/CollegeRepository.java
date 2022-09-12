package com.collegeapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.collegeapp.models.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {
      
//	drived Query
	List<College> findByAddressCity(String city);
	List<College> findByAddressStreetName(String location);
	
// custom query
@Query("From College c inner join c.university u where u.universityName=?1")
 List<College> getCollegeByUniversity(String universityName);

@Query("From College c inner join c.department u where u.departmentName=?1")
List<College> getCollegeByDepartment(String departmentName);

//@Query("From College c inner join c.address a inner join c.university u where a.location=?1 and u.universityName=?2 ")  
//List<College>getCollegeByLocationAndUniversity(String location, String universityName);


}
