package com.person.poc.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Person {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	
}
