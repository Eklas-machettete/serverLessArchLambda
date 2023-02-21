package com.arya.aws.awsLambda.domain;
public class Employee {
	String name;
	String id;
	String address;
	String department;
	public Employee() {}
	public Employee(String name, String id, String address, String department) {
		this.name=name;
		this.id=id;
		this.address=address;
		this.department=department;}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
}
