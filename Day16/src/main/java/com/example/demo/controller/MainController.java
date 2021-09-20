package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.AdharCard;
import com.example.demo.dto.AdharCardDto;
import com.example.demo.service.MainService;

@CrossOrigin(origins = "http://localhost:8083")
@RestController
@RequestMapping("/API")
public class MainController {

	@Autowired
	private MainService mainService;

	@PostMapping(value = "/insert")
	public ResponseEntity<AdharCard> insertAdharCard(@RequestBody AdharCardDto adharCardDto) {
		try {
			AdharCard detail = mainService.save(adharCardDto);
			return new ResponseEntity<>(detail, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping(value = "/delete")
	public ResponseEntity<AdharCard> deleteAdharCard(@RequestParam(value = "id") Long id) {
		try {
			AdharCard user = mainService.deleteById(id);
			return ResponseEntity.ok().body(user);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		}

	}

	@GetMapping("/get")
	public List<AdharCard> getAdharCard() {
		return mainService.findAll();
	}

	@GetMapping("/getid")
	public Optional<AdharCard> getAdharCard(@RequestParam(value = "id") long id) {
		Optional<AdharCard> adharCard = mainService.findById(id);
		return adharCard;

	}

}
