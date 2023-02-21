package com.arya.aws.awsLambda.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

import com.arya.aws.awsLambda.domain.Employee;

@Repository
public class EmployeeDao {
	public List<Employee> createEmployeeList(){
		return  Stream.of(
				new Employee("John","1","New York", "Developer"),
				new Employee("Peter","2","Ankara", "Developer"),
				new Employee("Anderson","3","Riyad", "DevOps"),
				new Employee("Eklas","4","Dhaka", "Frontend")
				).collect(Collectors.toList());
	}
	
}
