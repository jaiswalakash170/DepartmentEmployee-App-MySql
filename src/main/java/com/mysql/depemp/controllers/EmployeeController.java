package com.mysql.depemp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.depemp.dao.EmployeeRepo;
import com.mysql.depemp.models.Employee;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeRepo empRepo;
	
	@GetMapping("/show")
	public List<Employee> showEmployees()
	{
		List<Employee> tempList = new ArrayList<Employee>();
		tempList = empRepo.findAll();
		return tempList;
	}
	
	@PutMapping(path="/update", consumes={"application/json"})
	public String editEmployee(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return "Updated employee";
	}
	
	@PostMapping(path="/add", consumes={"application/json"})
	public Employee addEmployee(@RequestBody Employee emp)
	{
		empRepo.save(emp);
		return emp;
	}
	
	@DeleteMapping("/delete/{empId}")
	public Employee deleteEmployee(@PathVariable int empId)
	{
		Employee newEmp = (Employee)empRepo.findById(empId).orElse(new Employee());
		empRepo.deleteById(empId);;
		return newEmp;
	}
}
