package com.example.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="EMPLOYEE") 
public class Employee implements Comparable<Employee> {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	long employeeId;
	
	String employeeName;
	
	String designation;
	
	@ManyToMany(cascade = CascadeType.ALL )  
	@JoinColumn(name="departmentId")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	List<Department> department;
	
	int salary;
	
	@ManyToMany(cascade = CascadeType.ALL )  
	@JoinColumn(name="skillId")
	@JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
	List<Skills> skills;

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Department> getDepartment() {
		return department;
	}

	public void setDepartment(List<Department> department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}

	@Override
	public int compareTo(Employee st){  
		if(salary==st.salary)  
			return 0;  
		else if(salary>st.salary)  
			return 1;  
		else  
			return -1;  
		}  
		


	
	
}
