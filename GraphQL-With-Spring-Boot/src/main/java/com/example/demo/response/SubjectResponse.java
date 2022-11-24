package com.example.demo.response;

import com.example.demo.entity.Subject;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectResponse {

	private Long id;

	private String subjectName;
	
	
	private Double Marks_obtained;

	public SubjectResponse(Subject subject) {

		this.id = subject.getId();
		this.subjectName = subject.getSubject_name();
		this.Marks_obtained = subject.getMarks_obtained();
	}


}
