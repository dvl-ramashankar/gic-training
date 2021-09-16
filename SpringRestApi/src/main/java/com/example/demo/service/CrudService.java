package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;

@Service
public class CrudService {

	@Autowired
	public EmployeeRepo employeeRepo;

	public Employee save(EmployeeDto employeeDto) {
		Employee emp = new Employee();
		emp.setName(employeeDto.getName());
		emp.setAddress(employeeDto.getAddress());
		emp.setAge(employeeDto.getAge());
		emp.setDepartment(employeeDto.getDepartment());
		emp.setEmpId(employeeDto.getEmpId());
		return employeeRepo.save(emp);

	}

	public Employee findById(long employeeId) {
		return employeeRepo.findById(employeeId);
	}

	public Employee deleteById(long id) {

		return employeeRepo.deleteById(id);
	}

	public Employee updates(EmployeeDto employeeDto,Employee emp) {
		
		if (employeeDto.getEmpId() != 0) {
			emp.setEmpId(employeeDto.getEmpId());
		}
		if (employeeDto.getName() != null) {
			emp.setName(employeeDto.getName());
		}
		if (employeeDto.getAddress() != null) {
			emp.setAddress(employeeDto.getAddress());
		}
		if (employeeDto.getAge() != 0) {
			emp.setAge(employeeDto.getAge());
		}
		if (employeeDto.getDepartment() != null) {
			emp.setDepartment(employeeDto.getDepartment());
		}
		return employeeRepo.save(emp);

	}
}
