package org.khmer.club.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.khmer.club.model.PersonModel;

public class PhotoService {
	
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
