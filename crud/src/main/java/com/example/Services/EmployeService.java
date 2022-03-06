package com.example.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.Model.Employee;
import com.example.Repository.EmployeeRepository;

@Service
public class EmployeService  {
	
	@Autowired
	EmployeeRepository employeeRepository ;

	public List<Employee> fetchAllEmployees() {
		 List<Employee> emp = new ArrayList<>();
		 employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "salary")).forEach(emp::add);
		 return emp;
	}

	
	
	public ResponseEntity<Employee> fetchEmployeesById(long id) {
		Optional<Employee>  e  = employeeRepository.findById(id);
		return  new ResponseEntity<>(e.get(),HttpStatus.OK);
	}

	public void saveEmployees(Employee employee) {
		employeeRepository.save(employee);
		
	}
	

	public void deleteEmployee(long employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

}
