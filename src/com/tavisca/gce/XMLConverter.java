package com.tavisca.gce;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class XMLConverter {

	public static void main(String[] args) {
		/*
		 * Person p1 = new Person(1, "Sushovan", "Karmakar", 22);
		 * 
		 * try { FileOutputStream fos = new FileOutputStream(new File("./person.xml"));
		 * XMLEncoder encoder = new XMLEncoder(fos); encoder.writeObject(p1);
		 * encoder.close(); fos.close();
		 * 
		 * }catch (IOException ioException) { ioException.printStackTrace(); }
		 */
		PersonList personList = new PersonList();
		Person person1 = new Person(1, "Sayan", "Karmakar", 16);
		Person person2 = new Person(2, "Sushovan", "Karmakar", 22);
		personList.setPersonList(new ArrayList<Person>());
		personList.getPersonList().add(person1);
		personList.getPersonList().add(person2);
		
		try {
			JAXBContext context = JAXBContext.newInstance(PersonList.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(personList, new File("person1.xml"));
			marshaller.marshal(personList, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
