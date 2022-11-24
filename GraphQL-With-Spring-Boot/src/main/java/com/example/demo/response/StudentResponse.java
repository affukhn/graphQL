package com.example.demo.response;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.entity.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse
{
	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String Street;
	
	private String city;
	
	private Student student;
	
	private List<SubjectResponse> learningSubject;
	
	private String FullName;

	public StudentResponse(Student student) {
		this.student=student;
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();
		this.Street = student.getAddress().getStreet();
		this.city = student.getAddress().getCity();
		
		/*
		 * if(student.getLearningSubject() != null) { learningSubject = new
		 * ArrayList<SubjectResponse>(); for(Subject subject :
		 * student.getLearningSubject()) { learningSubject.add(new
		 * SubjectResponse(subject)); } }
		 */
	}
	
	
	
	
	

}
