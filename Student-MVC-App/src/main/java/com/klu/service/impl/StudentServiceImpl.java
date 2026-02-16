package com.klu.service.impl;

import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.service.StudentService;

import java.util.*;

@Service
public class StudentServiceImpl implements StudentService{
    
	private List<Student> studentList = new ArrayList<>();
	
	//Welcome message
	@Override
	public String getWelcomeMessage() {	
		return "Welcome to student MVC CRUD Application";
	}
	
	//create
	@Override
	public Student createStudent(Student student) {
		studentList.add(student);
		return student;	
	}
	
	
	//Read - getById
	@Override
	public Student getStudentById(int id) {
	    
		for(Student st : studentList) {
			  if(st.getId()==id) {
				  return st;
			  }
		}
		return null;	
	}
	
	
	//READ - get all the student profiles
	@Override
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	
	// Update the student profile
	@Override
	public Student updateStudent(int id, Student student) {
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getId()==id) {
				 student.setId(id);
				 studentList.set(i, student);
				 return student;
			}
		}
		   
		
		return null;
	}
	
	// delete the student profile
		@Override
	 public String deleteStudent(int id) {
	  	for(Student st : studentList) {
			if(st.getId()== id) {
				studentList.remove(st);
				return "Student record deleted successfully";
			}
		}
		return "No Student record found";
		
	}
		
		
	// search for the student profile
	@Override	
	 public List<Student> searchStudent(String name, String course){
		List<Student> result = new ArrayList<>();
		for(Student st : studentList) {
			if(st.getName().equalsIgnoreCase(name) && st.getCourse().equalsIgnoreCase(course)) {
				result.add(st);
			}
		}
		
		return result;
			
		
	 }
	
}
