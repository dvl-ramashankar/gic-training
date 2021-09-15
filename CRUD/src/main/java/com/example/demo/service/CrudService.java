package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDetailsDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repository.EmployeeDetailsRepo;
import com.example.demo.repository.EmployeeRepo;

@Service
public class CrudService {

	@Autowired
	public EmployeeRepo employeeRepo;
	
	@Autowired
	public EmployeeDetailsRepo employeeDetailsRepo;
	
	public Employee  save(EmployeeDto employeeDto)
	{
		Employee emp=new Employee();
		emp.setName(employeeDto.getName());
		emp.setAddress(employeeDto.getAddress());
		emp.setAge(employeeDto.getAge());
		emp.setDepartment(employeeDto.getDepartment());
		emp.setEmpId(employeeDto.getEmpId());
		return employeeRepo.save(emp);
	
	}
	public EmployeeDetails saveEmpDetails(EmployeeDetailsDto employeeDetailsDto,Employee emp)
	{
		EmployeeDetails empDetails=new EmployeeDetails();
		empDetails.setAdharCard(employeeDetailsDto.getAdharCard());
		empDetails.setContactno(employeeDetailsDto.getContactno());
		empDetails.setPanCard(employeeDetailsDto.getPanCard());
		EmployeeDetails saveempDetails=employeeDetailsRepo.save(empDetails);
		emp.setEmployeeDetails(empDetails);
		employeeRepo.save(emp);
		return saveempDetails;
	}
	public Employee findById(long employeeId) {
		return employeeRepo.findById(employeeId);
	}
	public Employee findByempId(long employeeId) {
	return employeeRepo.findByempId(employeeId);
	}
}
