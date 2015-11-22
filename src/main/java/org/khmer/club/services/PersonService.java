package org.khmer.club.services;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.khmer.club.model.PersonModel;

public class PersonService {
  
	SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	// create a new person info
	public PersonModel createPerson(PersonModel person){		
		Session session = sessionFactory.openSession();
	 	session.beginTransaction();
	 	//PersonModel member=(PersonModel) session.save(person);
	 	// after it insert record, it return new entity record
	 	PersonModel member=(PersonModel) session.merge(person);
	 	session.getTransaction().commit();
        session.close();  
		return member;
	}
	
	// get all people records
	public List<PersonModel> getPeople(){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<PersonModel> peopleList = session.createCriteria(PersonModel.class).list();
		session.close();
		return peopleList;
	}
	
	// get a person record
	public PersonModel getPerson(long user_id){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	 	PersonModel person=session.get(PersonModel.class, user_id);
		session.close();
		return person;
	}
	
	// delete a person record
	public PersonModel deletePerson(long user_id){
		PersonModel person=new PersonModel();
		person.setUser_id(user_id);
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	 	session.delete(person);
	 	session.getTransaction().commit();
		session.close();
		
		return person;
	}
	
	// update a person record
	public PersonModel updatePerson(PersonModel person){
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	 	session.update(person);
	 	session.getTransaction().commit();
		session.close();
		
		return person;
	}
}
