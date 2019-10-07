package com.tavisca.gce;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;


public class JSONConverter {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		
		PersonList personList = new PersonListCreator().createPersonList();
		
		String jsonString = objectMapper.writeValueAsString(personList);
		System.out.println(jsonString);
		
	}
}
