package com.example.demo.resolver;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Subject;
import com.example.demo.enums.SubjectNameFilter;
import com.example.demo.response.StudentResponse;
import com.example.demo.response.SubjectResponse;

import graphql.kickstart.tools.GraphQLResolver;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {
	
	public List<SubjectResponse> getLearningSubject(StudentResponse studentResponse,SubjectNameFilter subjectNameFilter)
	{
	List<SubjectResponse>	 learningSubject = new ArrayList<SubjectResponse>();
	 
	  
	    
		if(studentResponse.getStudent().getLearningSubject() != null)
		{
			for(Subject subject : studentResponse.getStudent().getLearningSubject())
			{ 
				
				if(subjectNameFilter.name().equalsIgnoreCase("All"))
				{
					learningSubject.add(new SubjectResponse(subject));
				}
			   else if(subjectNameFilter.name().equalsIgnoreCase(subject.getSubject_name()))
				{
					learningSubject.add(new SubjectResponse(subject));
				}
			   
			}
	   }
		return learningSubject;
		
		
	}
	
	
	
	
	public String getFullName(StudentResponse studentResponse)
	{
		return studentResponse.getFirstName()+" "+studentResponse.getLastName();
	}
}
