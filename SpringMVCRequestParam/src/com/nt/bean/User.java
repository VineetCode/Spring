package com.nt.bean;

public class User {
	// Properties of User
	private String name;
	private int age;
	private String email;
	private String country;

	// setter and getter method

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// toString() method
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", country=" + country + "]";
	}

}// end of User class
