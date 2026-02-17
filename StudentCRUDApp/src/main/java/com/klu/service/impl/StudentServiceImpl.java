package com.klu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.repo.StudentRepo;
import com.klu.service.StudentService;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService{
    
	@Autowired
	private StudentRepo studentRepo;
	
	
	//create
	@Override
	public Student createStudent(Student student) {
		return studentRepo.save(student);
		
	}
	
	
	//Read - getById
	@Override
	public Student getStudentById(int id) {  
		return studentRepo.findById(id).orElse(null);	
	}
	
	
	//READ - get all the student profiles
	@Override
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	
	// Update the student profile
	@Override
	public Student updateStudent(int id, Student student) {
		if(studentRepo.existsById(id))
	           student.setId(id);
		

		return studentRepo.save(student);
			
	}
	
	
	// delete the student profile
		@Override
	 public String deleteStudent(int id) {
			if(studentRepo.existsById(id)) {
	                studentRepo.deleteById(id);

				return "Student record deleted successfully";
			}			
		
		return "No Student record found";
		
	}
		
		
	// search for the student profile
	@Override	
	 public List<Student> searchStudent(String name, String course){
		  return studentRepo.findByNameIgnoreCaseAndCourseIgnoreCase(name, course);
		
			
	 }
	
}
