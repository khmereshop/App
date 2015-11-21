package org.khmer.club.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Facebook")
public class FacebookModel {
	
	@Column(name="facebook_id")
	private long facebook_id;
	private String gender;
	private String firstName;
	private String lastName;
	private String location;
	private String photo;
	
	@JoinColumn(name="user_id")
	private PersonModel person;
	
	public long getFacebook_id() {
		return facebook_id;
	}
	public void setFacebook_id(long facebook_id) {
		this.facebook_id = facebook_id;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public PersonModel getPerson() {
		return person;
	}
	public void setPerson(PersonModel person) {
		this.person = person;
	}
	
	
}
