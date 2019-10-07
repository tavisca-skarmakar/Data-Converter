package com.tavisca.gce;

import java.io.IOException;
import java.util.ArrayList;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSONConverter {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		PersonList personList = new PersonList();
		Person person1 = new Person(1, "Sayan", "Karmakar", 16);
		Person person2 = new Person(2, "Sushovan", "Karmakar", 22);
		Person person3 = new Person(3, "Puja","Pal",21);
		personList.setPersonList(new ArrayList<Person>());
		personList.getPersonList().add(person1);
		personList.getPersonList().add(person2);
		personList.getPersonList().add(person3);
		
		
		String jsonString = objectMapper.writeValueAsString(personList);
		System.out.println(jsonString);
		
	}
}
