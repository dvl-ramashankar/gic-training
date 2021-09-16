package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.domain.student;

public interface StudentRepo extends MongoRepository<student, Integer> {

}
