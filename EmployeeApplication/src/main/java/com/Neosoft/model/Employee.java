package com.Neosoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 private long id;
 @Column(name="first_name", nullable= false)
 private String firstName;
 @Column(name="sur_name")
 private String surName;
 @Column(name="email_id")
 private String emailId;
 @Column(name="contact_no")
 private String contactNo;
 @Column(name="dob")
 private String dob;
 @Column(name="date_of_joining")
 private String dateOfJoining;
 public Employee() {
 }
 
public Employee(String firstName, String surName, String emailId, String contactNo, String dob, String dateOfJoining) {
	super();
	this.firstName = firstName;
	this.surName = surName;
	this.emailId = emailId;
	this.contactNo = contactNo;
	this.dob = dob;
	this.dateOfJoining = dateOfJoining;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getSurName() {
	return surName;
}
public void setSurName(String surName) {
	this.surName = surName;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getDateOfJoining() {
	return dateOfJoining;
}
public void setDateOfJoining(String dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}
 
}