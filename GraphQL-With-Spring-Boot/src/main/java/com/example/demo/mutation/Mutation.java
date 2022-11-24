package com.example.demo.mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.request.CreateStudentRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.StudentService;

import graphql.kickstart.servlet.osgi.GraphQLMutationProvider;
import graphql.kickstart.tools.GraphQLMutationResolver;

@Service
public class Mutation implements GraphQLMutationResolver
{
	@Autowired
	StudentService studentService;
	
	public StudentResponse createStudent(CreateStudentRequest createStudentRequest)
	{
		return new StudentResponse(studentService.createStudent(createStudentRequest));
	}

}
