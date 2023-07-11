package com.springboot.srithar.model;

import java.util.List;
import java.util.Map;

public class Person {

	private int id;
	private String name;
	private int age;
	private List<Map<String, Address>> address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Map<String, Address>> getAddress() {
		return address;
	}

	public void setAddress(List<Map<String, Address>> address) {
		this.address = address;
	}

	

}
