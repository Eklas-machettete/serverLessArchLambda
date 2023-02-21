package com.arya.aws.awsLambda;

import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.arya.aws.awsLambda.domain.Employee;
import com.arya.aws.awsLambda.repository.EmployeeDao;

@SpringBootApplication
public class ServerLessArchLambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerLessArchLambdaApplication.class, args);
	}

	@Autowired
	private EmployeeDao employeeDao;
	
	@Bean
	public Function<String,List<Employee>> findEmployeeByDepartment(){
		return (department)->employeeDao.createEmployeeList().stream().filter((employee)->employee.getDepartment().equals(department)).collect(Collectors.toList());
	}
	
	@Bean
	public Supplier<List<Employee>> employees(){
		return()->employeeDao.createEmployeeList();
	}
	
	
	
}
