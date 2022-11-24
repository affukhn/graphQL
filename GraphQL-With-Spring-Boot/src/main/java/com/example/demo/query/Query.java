package com.example.demo.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.repository.StudentRepository;
import com.example.demo.request.SampleRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.StudentService;

import graphql.kickstart.tools.GraphQLQueryResolver;




@Component
public class Query implements GraphQLQueryResolver
{
	@Autowired
	StudentService studentService;
	
	public String FirstQuery()
	{
		return "First Query";
	}
   
	public String lastName()
	{
		return "last Name";
	}
	
	public String FirstName(SampleRequest sampleRequest)
	{
		return sampleRequest.getFirstName()+" "+sampleRequest.getLastName();
	}
	
	
	public StudentResponse getStudent(long id)
	  {
		  return new StudentResponse(studentService.getStudentById(id));
	  }
   

}
