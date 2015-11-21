package org.khmer.club.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Photo")
public class PhotoModel {
	
	// create auto primary key
	@Id @GeneratedValue (strategy=GenerationType.AUTO)
	@Column (name="photo_id")
	private long photo_id;
	private String filename;
	private String title;
	private Date createdDate;
	
	@JoinColumn(name="user_id")
	private PersonModel person;
	
	public long getPhoto_id() {
		return photo_id;
	}
	public void setPhoto_id(long photo_id) {
		this.photo_id = photo_id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public PersonModel getPerson() {
		return person;
	}
	public void setPerson(PersonModel person) {
		this.person = person;
	}
	
	
	
}
