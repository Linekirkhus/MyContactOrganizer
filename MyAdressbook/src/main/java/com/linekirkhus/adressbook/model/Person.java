package com.linekirkhus.adressbook.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "person_id")
	private Long id;

	@Column(name = "person_firstname")
	private String firstname;

	@Column(name = "person_lastname")
	private String lastname;

	private String fullname;

	@Column(name = "phone_number")
	private String phone_number;

	@Column(name = "person_email")
	private String email;

	public Person ( ) {
	}

	public Person ( String firstname , String lastname , String phone_number , String email ) {

		this.firstname    = firstname;
		this.lastname     = lastname;
		this.phone_number = phone_number;
		this.email = email;
	}

	public Long getId ( ) {
		return id;
	}

	public void setId ( Long id ) {
		this.id = id;
	}

	public String getFirstname ( ) {
		return firstname;
	}

	public void setFirstname ( String firstname ) {
		this.firstname = firstname;
	}

	public String getLastname ( ) {
		return lastname;
	}

	public void setLastname ( String lastname ) {
		this.lastname = lastname;
	}

	public String getFullname ( ) {
		return firstname + " " + lastname;
	}

	public void setFullname ( String firstname, String lastname ) {
		this.fullname = this.firstname + this.lastname;
	}

	public String getPhone_number ( ) {
		return phone_number;
	}

	public void setPhone_number ( String phone_number ) {
		this.phone_number = phone_number;
	}

	public String getEmail ( ) {
		return email;
	}

	public void setPerson_email ( String email ) {
		this.email = email;
	}

	@Override
	public String toString ( ) {
		return "=========== Person =========" +
		       "\nid: " + id +
		       "\nFirst name: " + firstname  +
		       "\nLast name: " + lastname  +
		       "\nFull name: "+ firstname + " " + lastname +
		       "\nFull name: "+ fullname +
		       "\nPhone no: " + phone_number +
		       "\nEmail: " + email;
	}
}
