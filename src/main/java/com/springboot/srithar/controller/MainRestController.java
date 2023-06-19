package com.springboot.srithar.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.springboot.srithar.model.Person;
import com.springboot.srithar.service.PersonService;

@RestController
public class MainRestController {

	@Autowired
	PersonService personService;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/")
	public String root() {
		 return personService.getRoot();

	}

	@GetMapping(value = "/person/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Person person(@PathVariable("id") int id) {
		return personService.getPerson(id);
	}
	
	@GetMapping(value = "/person", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> person() {
		return personService.getAllPerson();
	}
	
	@PostMapping(value="/upload",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String upload(@RequestParam("file") MultipartFile file) throws IOException {
		File myFile=new File("/var/tmp/"+file.getOriginalFilename());
		myFile.createNewFile();
		System.out.println(file.getSize());
		FileOutputStream fos = new FileOutputStream(myFile);
		fos.write(file.getBytes());
		fos.close();
		System.out.println("Success");
		return "File Uploaded Successfully";
	}

}
