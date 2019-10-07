package com.tavisca.gce;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.codehaus.jackson.util.DefaultPrettyPrinter;

//In JSON file, all the curly braces are objects

public class JSONConverter {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		PersonList personList = new PersonListCreator().createPersonList();
		
		ObjectMapper objectMapper = new ObjectMapper();
		ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
		objectWriter.writeValue(new File("person.json"), personList);
		
		String jsonString = objectWriter.writeValueAsString(personList);
		System.out.println(jsonString);
	}
}
