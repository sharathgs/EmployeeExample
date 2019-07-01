package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Model.Employee;
import com.employee.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepo;
	
	
	
	public List<Employee> getAllEmployees()
	{
		List<Employee> getEmployeeData = new ArrayList<Employee>();
		getEmployeeData = empRepo.findAll();
		if(getEmployeeData.isEmpty())
		{
			return getEmployeeData;
		}else {
			return null;
		}
	}
	
	
	public String addEmployee(Employee employee)
	{
		Employee addedEmployee = empRepo.save(employee);
		if(addedEmployee != null)
		{
			return "added successfully";
		}else
		{
			return "Not added";
		}
	}
	
	
	public Optional<Employee> getEmployeeById(int id)
	{
		Optional<Employee> employee = empRepo.findById(id);
		if(employee.isPresent())
			return employee;
		else
			return null;
	}
	
	
	
	
	

}
