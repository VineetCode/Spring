package com.example.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.example.app.entity.Person;
import com.example.app.services.PersonManagementServices;

@SpringBootApplication
public class SpringBootDataPaginationDemoApplication implements CommandLineRunner {

	@Autowired
	private PersonManagementServices personManagementServices;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataPaginationDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		//createPersons();
	 findByLastNameUsingPagnation();
	}
	
	private void findByLastNameUsingPagnation(){
		List<Person> person_list = personManagementServices.findByLastName("Kumar",
				new PageRequest(0, 4, Direction.ASC, "firstName"));
		person_list.forEach(System.out::println);
	}

	private void createPersons() {

		Person p1 = new Person("Vineet", "Singh", "vineet@gmail.com", new Date());
		Person p2 = new Person("Vikash", "Singh", "vikash@gmail.com", new Date());
		Person p3 = new Person("Vipul", "Singh", "vipul@gmail.com", new Date());
		Person p4 = new Person("Kalyan", "Singh", "kalyan@gmail.com", new Date());
		Person p5 = new Person("Sumit", "Kumar", "sumit@gmail.com", new Date());
		Person p6 = new Person("Bhanu", "Kumar", "bhanu@gmail.com", new Date());
		Person p7 = new Person("Ranajay", "Gupta", "ranajay@gmail.com", new Date());
		Person p8 = new Person("Akshay", "Kumar", "akshay@gmail.com", new Date());
		Person p9 = new Person("Vinod", "Gupta", "vinod@gmail.com", new Date());
		Person p10 = new Person("Sanjay", "Tiwary", "sanjay@gmail.com", new Date());
		Person p11 = new Person("Vivek", "Tiwary", "vivek@gmail.com", new Date());
		Person p12 = new Person("Rinku", "Tiwary", "rinku@gmail.com", new Date());
		Person p13 = new Person("Ravi", "Kumar", "ravi@gmail.com", new Date());

		List<Person> person_list=new ArrayList<>();
		person_list.add(p1);
		person_list.add(p2);
		person_list.add(p3);
		person_list.add(p4);
		person_list.add(p5);
		person_list.add(p6);
		person_list.add(p7);
		person_list.add(p8);
		person_list.add(p9);
		person_list.add(p10);
		person_list.add(p11);
		person_list.add(p12);
		person_list.add(p13);
		
		  personManagementServices.createPerons(person_list);
	 }
}
