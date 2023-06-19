package com.springboot.srithar.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.springboot.srithar.model.Address;
import com.springboot.srithar.model.Person;

public class PersonUtil {
	static Address a1=new Address();
	static Address a2=new Address();
	static Person p1=new Person();
	static Person p2=new Person();
	
	static {
		a1.setAddr1("3/50");
		a1.setAddr2("V Kollaikkadu");
		a1.setCity("Pattukkottai");
		a1.setState("Tamilnadu");
		a1.setCountry("India");
		
		a2.setAddr1("Zolo");
		a2.setAddr2("Sholinganallur");
		a2.setCity("Chennai");
		a2.setState("Tamilnadu");
		a2.setCountry("India");
		
		
		p1.setId(1);
		p1.setName("Srithar");
		p1.setAge(26);
		Map<String, Address> m1=new HashMap<>();
		m1.put("Home", a1);
		Map<String, Address> m2=new HashMap<>();
		m2.put("Work", a2);
		
		p1.setAddress(List.of(m1,m2));
		
		p2.setId(2);
		p2.setName("Sriram");
		p2.setAge(24);
		p2.setAddress(List.of(m1));
	}
	
	public static Person getPerson(int id) {
		return getAllPersons().stream().filter(a->a.getId()==id).collect(Collectors.toList()).get(0);
	}
	
	public static List<Person> getAllPersons() {
		return List.of(p1,p2);
	}

}
