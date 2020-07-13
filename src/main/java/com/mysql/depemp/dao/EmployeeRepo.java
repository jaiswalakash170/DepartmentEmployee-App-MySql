package com.mysql.depemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mysql.depemp.models.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
