package com.luv2code.springboot.cruddemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	// define fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lasttName;
	
	@Column(name="email")
	private String email;
	
	// define constructors
	public Employee() {
		
	}

	public Employee(String firstName, String lasttName, String email) {
		this.firstName = firstName;
		this.lasttName = lasttName;
		this.email = email;
	}
	
	// define getter/setter

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLasttName() {
		return lasttName;
	}

	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	// define tostring
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lasttName=" + lasttName + ", email=" + email
				+ "]";
	}
	
	

}
