package com.springboot.srithar.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.srithar.model.Person;
import com.springboot.srithar.utils.PersonUtil;

@Service
public class PersonServiceImpl implements PersonService{

	@Override
	public String getRoot() {
		return "Hello World!\n";
	}

	@Override
	public Person getPerson(int id) {
		return PersonUtil.getPerson(id);
	}

	@Override
	public List<Person> getAllPerson() {
		return PersonUtil.getAllPersons();
	}

}
