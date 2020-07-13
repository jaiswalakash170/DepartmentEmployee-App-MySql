package com.mysql.depemp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mysql.depemp.models.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer>{

}
