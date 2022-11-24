package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.request.CreateStudentRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {

	public Student(CreateStudentRequest createStudentRequest) {

		this.FirstName = createStudentRequest.getFirstName();
		this.LastName = createStudentRequest.getLastName();
		this.email = createStudentRequest.getEmail();

	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Column(name = "first_name")
	private String FirstName;

	@Column(name = "last_name")
	private String LastName;

	@Column(name = "email")
	private String email;

	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;

	@OneToMany(mappedBy = "student")
	private List<Subject> learningSubject;
}
