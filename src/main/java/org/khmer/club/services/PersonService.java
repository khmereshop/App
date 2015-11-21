package org.khmer.club.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.khmer.club.model.PersonModel;

public class PersonService {
  
	public PersonModel createPerson(PersonModel person){
		System.out.println("*** I am beginning ***");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
	 	session.beginTransaction();
	 	session.save(person);
	 	session.getTransaction().commit();
        session.close();
        
        System.out.println("** I am here ***");
        System.out.println(person.getEmail());
        
		return person;
	}

	public List<PersonModel> getPerson(long user_id){
		PersonModel person = new PersonModel();
		person.setUser_id(user_id);
		person.setEmail("KhmerEshop@yahoo.com");
		person.setNickname("ssan");
		person.setJoinDate(new Date());
		person.setBirthDate("12/01/1970");
		List<PersonModel> myList = new ArrayList<PersonModel>();
		myList.add(person);
		return myList;
	}
}
