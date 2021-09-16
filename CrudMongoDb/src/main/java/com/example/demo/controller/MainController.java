package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.student;
import com.example.demo.repository.StudentRepo;

@RestController
public class MainController {

	@Autowired
	private StudentRepo studentRepo;

	@PostMapping("/insert")
	public String saveStudent(@RequestBody student newStudent) {
		
	 studentRepo.save(newStudent);
	 return "inserted :"+ newStudent.getId();
	}


	@GetMapping("/get")
	public List<student> getStudent() {
		return studentRepo.findAll();
	}

	@GetMapping("/get/{id}")
	public Optional<student> getStudent(@PathVariable int id) {
		return studentRepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id)
	{
		studentRepo.deleteById(id);
		return "deleted with id:"+ id;
	}
}
