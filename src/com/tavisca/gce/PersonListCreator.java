package com.tavisca.gce;

import java.util.ArrayList;
public class PersonListCreator {
	public PersonList createPersonList() {
		PersonList personList = new PersonList();
		Person person1 = new Person(1, "Sayan", "Karmakar", 16);
		Person person2 = new Person(2, "Sushovan", "Karmakar", 22);
		personList.setPersonList(new ArrayList<Person>());
		personList.getPersonList().add(person1);
		personList.getPersonList().add(person2);
		return personList;
	}
}
