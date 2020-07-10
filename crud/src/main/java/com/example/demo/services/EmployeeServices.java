package com.example.demo.services;

import java.util.List;

import com.example.demo.models.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();

	void save(Employee employee);

	Employee getById(Long id);

	void deleteViaId(long id);
}
