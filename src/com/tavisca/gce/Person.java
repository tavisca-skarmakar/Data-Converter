package com.tavisca.gce;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Person {
	private int eid;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {}
	
	public Person(int eid, String firstName, String lastName, int age) {
		this.eid = eid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}
}
