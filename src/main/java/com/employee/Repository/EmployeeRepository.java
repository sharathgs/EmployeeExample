package com.employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
