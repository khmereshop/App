package org.khmer.club;

import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.khmer.club.model.PersonModel;
import org.khmer.club.services.PersonService;

@Path("/person")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class PersonResource {

	PersonService  personService=new PersonService();
	
	@POST
	public PersonModel createPerson(PersonModel person){
		System.out.println("*** I am this now ***");
		System.out.println(person.getEmail());
		
		person.setJoinDate(new Date());
		person.setLoginDate(new Date());
		return personService.createPerson(person);
	}
	
	@GET
	@Path("{user_id}")
	public List<PersonModel> getPerson(@PathParam("user_id") long user_id){
		
		return personService.getPerson(user_id);
	}
	
}
