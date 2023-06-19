package com.springboot.srithar.service;

import java.util.List;

import com.springboot.srithar.model.Person;

public interface PersonService {
	public String getRoot();
	public Person getPerson(int id);
	public List<Person> getAllPerson();
	
}
