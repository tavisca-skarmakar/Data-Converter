package com.tavisca.gce;

import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="peopleList")
public class PersonList {
	List<Person> personList;

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
