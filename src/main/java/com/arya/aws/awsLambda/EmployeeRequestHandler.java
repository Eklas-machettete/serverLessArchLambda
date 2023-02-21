package com.arya.aws.awsLambda;

import java.util.List;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;
import com.arya.aws.awsLambda.domain.Employee;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
public class EmployeeRequestHandler {

	public class EmployeeHandler  extends SpringBootRequestHandler<APIGatewayProxyRequestEvent,List<Employee>>{
		
	}

}
