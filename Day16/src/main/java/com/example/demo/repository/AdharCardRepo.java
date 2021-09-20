package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.AdharCard;

@Repository
public interface AdharCardRepo extends JpaRepository<AdharCard, Long> {

	AdharCard deleteById(long id);
	List<AdharCard> findAll();
	Optional<AdharCard> findById(long id);
}
