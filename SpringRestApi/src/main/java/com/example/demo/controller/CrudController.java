package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.CrudService;

@CrossOrigin(origins = "http://localhost:8082")
@RestController
@RequestMapping("/API")
public class CrudController {

	@Autowired
	private CrudService crudService;

	@PostMapping(value = "/insertEmployee")
	public ResponseEntity<Employee> insertEmployee(@RequestBody EmployeeDto employeeDto) {
		try {
			Employee detail = crudService.save(employeeDto);
			return new ResponseEntity<>(detail, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getEmployee")
	public ResponseEntity<Employee> getEmployee(@RequestParam(value = "id") Long employeeId) {
		try {
			Employee user = crudService.findById(employeeId);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	}

	@DeleteMapping("/deleteEmployee")
	public ResponseEntity<Employee> deleteEmployee(@RequestParam(value = "id") Long id) {
		try {
			Employee user = crudService.deleteById(id);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	}

	@PutMapping("/updateEmployee")
	public ResponseEntity<Employee> updateEmployee(@RequestBody EmployeeDto employeeDto,
			@RequestParam(value = "id") Long id) throws Exception {
		Employee user = crudService.findById(id);
		if (user != null) {
			Employee detail = crudService.updates(employeeDto, user);
			return new ResponseEntity<>(detail, HttpStatus.CREATED);
		}
		return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
	}
}
