package com.klu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klu.model.Student;
import java.util.List;


public interface StudentRepo extends JpaRepository<Student,Integer> {
 
	List<Student> findByNameIgnoreCaseAndCourseIgnoreCase(String name, String course); 
	
}



