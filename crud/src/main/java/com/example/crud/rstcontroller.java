package com.example.crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Employee;
import com.example.Services.EmployeService;

@RestController
@RequestMapping("/controller")
public class rstcontroller {
	
	public rstcontroller() {
		
	}
	
	@Autowired
	EmployeService employeService;
	
	@GetMapping("/fetchAllEmployees")
	public List<Employee> fetchAllEmployees(){
		List<Employee> le =  employeService.fetchAllEmployees();
		System.out.println(le);
		return  le;
		
	}
	
	@GetMapping("/fetchById/{employeeId}")
	public ResponseEntity<Employee> fetchById(@PathVariable long employeeId){
		return employeService.fetchEmployeesById(employeeId);
	}
	
	@PostMapping("/saveEmployees")
	public Employee saveEmployees (@RequestBody Employee employee) {
		
		try {
			employeService.saveEmployees(employee);
			return employee;
		} catch(Exception e) {
			return null;
		}
	}

	@DeleteMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable long employeeId) {
		try {
			employeService.deleteEmployee(employeeId);
			return "Transaction Success";
		} catch(Exception e) {
			return "Transaction Failed" ;
		}
	}
}
