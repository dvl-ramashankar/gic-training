package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDetailsDto;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeDetails;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.CrudService;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/API")
public class CrudController {

	@Autowired
	private CrudService crudService;

	@PostMapping(value = "/insertDetails")
	public ResponseEntity<Employee> saveDetails(@RequestBody EmployeeDto employeeDto) {
		try {
			Employee detail = crudService.save(employeeDto);
			return new ResponseEntity<>(detail, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping(value = "/insertempDetails")
	public ResponseEntity<EmployeeDetails> saveEmpDetails(@RequestBody EmployeeDetailsDto employeeDetailsDto, @RequestParam(value="empId") Long employeeId)
			{
		try
		{
			 Employee user = crudService.findByempId(employeeId);
			EmployeeDetails details=crudService.saveEmpDetails(employeeDetailsDto,user);
			return new ResponseEntity<>(details,HttpStatus.CREATED);
		}
		catch (Exception e) {
		return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);	
		}
		}
	 @GetMapping("/getemployee")
	    public ResponseEntity <Employee > getEmployee(@RequestParam(value = "id") Long employeeId) 
	 {
		 try
		 {
	        Employee user = crudService.findById(employeeId);	            
	        return ResponseEntity.ok().body(user);
	    }
		 catch (Exception e) {
			return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		 }
		
		}

	 }
