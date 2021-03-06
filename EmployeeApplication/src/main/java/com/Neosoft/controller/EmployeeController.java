package com.Neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Neosoft.model.Employee;
import com.Neosoft.service.EmployeeService;


@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	//handler method to handle list of Employees and return mav
	@GetMapping("/employees")
	public String studentLists(Model model) {
		model.addAttribute("employees",employeeService.getAllEmployees());
		return "employees";
}
	@GetMapping("/employees/new")
	public String createEmployeeForm(Model model) {
		//create Employee object to hold Employee form data
		Employee employee= new Employee();
		model.addAttribute("employee",employee);
		return "create_employee";
}
	@PostMapping("/employees")
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	@GetMapping("/employees/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		model.addAttribute("employee", employeeService.getEmployeeById(id));
		return "edit_employee";
	}
	@PostMapping("/employees/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee")Employee employee,
			Model model) {
		//get employee details from database by Id
		Employee existingEmployee= employeeService.getEmployeeById(id);
		existingEmployee.setId(id);
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setSurName(employee.getSurName());
		existingEmployee.setEmailId(employee.getEmailId());
		existingEmployee.setContactNo(employee.getContactNo());
		existingEmployee.setDob(employee.getDob());
		existingEmployee.setDateOfJoining(employee.getDateOfJoining());
		employeeService.updateEmployee(existingEmployee);
		return "redirect:/employees";
	}
	@GetMapping("/employees/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
		return "redirect:/employees";
	}
	
}
	
