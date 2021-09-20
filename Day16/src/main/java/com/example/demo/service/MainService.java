package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.AdharCard;
import com.example.demo.dto.AdharCardDto;
import com.example.demo.repository.AdharCardRepo;

@Service
public class MainService {

	@Autowired
	private AdharCardRepo adharCardRepo;

	public AdharCard save(AdharCardDto adharCardDto) {
		AdharCard adharCard = new AdharCard();
		adharCard.setName(adharCardDto.getName());
		adharCard.setAge(adharCardDto.getAge());
		adharCard.setAddress(adharCardDto.getAddress());
		adharCard.setFatherName(adharCardDto.getFatherName());
		adharCard.setuUID(adharCardDto.getuUID());
		return adharCardRepo.save(adharCard);
	}

	public AdharCard deleteById(long id) {
		if (adharCardRepo.deleteById(id).equals(null))
			return adharCardRepo.deleteById(id);
		else 
			throw new EntityNotFoundException("AdharCard Id " + id + " not found in the database");
	}

	public List<AdharCard> findAll() {
		return adharCardRepo.findAll();
	}

	public Optional<AdharCard> findById(long id) {
		if (adharCardRepo.findById(id).isPresent())
			return adharCardRepo.findById(id);
		else
			throw new EntityNotFoundException("AdharCard Id " + id + " not found in the database");
	}
}
