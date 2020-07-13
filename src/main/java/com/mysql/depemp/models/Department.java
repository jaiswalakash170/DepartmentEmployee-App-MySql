package com.mysql.depemp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department")
public class Department {
	@Id
	@Column(name="departmentid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int DepartmentID;
	
	@Column(name="departmentname")
	private String DepartmentName;
	
	public int getDepartmentID() {
		return DepartmentID;
	}
	public void setDepartmentID(int departmentID) {
		DepartmentID = departmentID;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [DepartmentID=" + DepartmentID + ", DepartmentName=" + DepartmentName + "]";
	}
}
