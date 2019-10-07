package com.tavisca.gce;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class CSVConverter {
	public static void main(String[] args) {
		PersonList personList = new PersonList();
		Person person1 = new Person(1, "Sayan", "Karmakar", 16);
		Person person2 = new Person(2, "Sushovan", "Karmakar", 22);
		personList.setPersonList(new ArrayList<Person>());
		personList.getPersonList().add(person1);
		personList.getPersonList().add(person2);
		writeCSV(personList);
	}
	private static final String CSV_SEPERATOR = ",";
	private static void writeCSV(PersonList personList) {
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("person.csv"), "UTF-8"));
			
			for (Person person : personList.getPersonList()) {
				StringBuffer oneLine = new StringBuffer();
				oneLine.append(person.getEid()).append(CSV_SEPERATOR);
				oneLine.append(person.getFirstName()).append(CSV_SEPERATOR);
				oneLine.append(person.getLastName()).append(CSV_SEPERATOR);
				oneLine.append(person.getAge());
				
				bw.write(oneLine.toString());
				bw.newLine();
			}
			bw.flush();
			bw.close();
		}
		catch (UnsupportedEncodingException e) {}
		catch(FileNotFoundException e) {}
		catch(IOException e) {}
	}
}
