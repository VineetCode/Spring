package com.infotech.person;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.infotech.person.entity.Person;
import com.infotech.person.services.PersonManagementServices;

@SpringBootApplication
public class SpringBootNamedNativeQueryDemoApplication implements CommandLineRunner{

	@Autowired
	private PersonManagementServices personManagementServices;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootNamedNativeQueryDemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
         getPeronInfoByLastName();
         getPersonInfoByEmailAndFirstName();
	}

	private void getPersonInfoByEmailAndFirstName() {
		 List<Person> personList=personManagementServices.getPersonInfoByEmailAndFirstName("vin@gmail.com","Singh");	
	        personList.forEach(System.out::println);
		
	}

	private void getPeronInfoByLastName() {
        List<Person> personList=personManagementServices.getPersonInfoByLastName("Singh");	
        personList.forEach(System.out::println);
	}
	
	
}

