package com.mysql.depemp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name="employeeid")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int EmployeeId;
	
	@Column(name="employeename")
	private String EmployeeName;
	
	@Column(name="department")
	private String Department;
	
	@Column(name="mailid")
	private String MailID;
	
	@Column(name="doj")
	private String DOJ;
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getMailID() {
		return MailID;
	}
	public void setMailID(String mailID) {
		MailID = mailID;
	}
	public String getDOJ() {
		return DOJ;
	}
	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", Department=" + Department
				+ ", MailID=" + MailID + ", DOJ=" + DOJ + "]";
	}
}

