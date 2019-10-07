package com.tavisca.gce;

import java.io.File;

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
		PersonList personList = new PersonListCreator().createPersonList();
		
		try {
			JAXBContext context = JAXBContext.newInstance(PersonList.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(personList, new File("person.xml"));
			marshaller.marshal(personList, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
