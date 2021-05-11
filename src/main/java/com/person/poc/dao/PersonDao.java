package com.person.poc.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.person.poc.model.Person;

public interface PersonDao extends MongoRepository<Person, Integer> {
	public Person findById(int Id);
	public List<Person> findAll(String Id);
}
