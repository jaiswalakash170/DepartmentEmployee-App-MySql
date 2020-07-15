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

import com.mysql.depemp.dao.DepartmentRepo;
import com.mysql.depemp.models.Department;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	DepartmentRepo depRepo;
	
	@GetMapping("/show")
	public List<Department> showDepartments()
	{
		List<Department> tempList = new ArrayList<Department>();
		tempList = depRepo.findAll();
		return tempList;
	}
	
	@PutMapping(path="/update", consumes={"application/json"})
	public String editDepartment(@RequestBody Department dep)
	{
		depRepo.save(dep);
		return "Updated department";
	}
	
	@PostMapping(path="/add", consumes={"application/json"})
	public Department addDepartment(@RequestBody Department dep)
	{
		depRepo.save(dep);
		return dep;
	}
	
	@DeleteMapping("/delete/{depId}")
	public Department deleteDepartment(@PathVariable int depId)
	{
		Department newDep = (Department)depRepo.findById(depId).orElse(new Department());
		depRepo.deleteById(depId);;
		return newDep;
	}
}
