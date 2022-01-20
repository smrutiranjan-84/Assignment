package com.Neosoft;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Neosoft.model.Employee;
import com.Neosoft.repository.EmployeeRepository;



@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		/*Employee employee1= new Employee("Smruti", "Mohanty","smruti.mohanty@neosoftmail.com","8328904215","18-07-1984", "13-12-2021");
		employeeRepository.save(employee1);
		*/
		

	
		
	}
	

}
