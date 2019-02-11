package com.acloudysky.studentbook.student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@ApiModel(description="All details about the student. ")
public class Student {
	@Id
	// @GeneratedValue
	private long id;
	
	@ApiModelProperty(notes="Name should have atleast 2 characters")
	@Size(min=2, message="Name should have atleast 2 characters")
	private String name;
	
	private String phonetNumber;

	private String email;
	
	public Student() {
		super();
	}

	public Student(long id, String name, String phoneNumber, String email) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phonetNumber = phoneNumber;
		
	}
	public long getId() {
		return id;
	}
	
	public void setId(long l) {
		this.id = l;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhoneNumber() {
		return phonetNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phonetNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}


}
