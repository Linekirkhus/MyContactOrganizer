package com.linekirkhus.adressbook.model;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "email", unique = true)
	private String email;


	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "password")
	private String password;

	@Transient
	private String passwordConfirm;

	public User ( ) {
	}

	public User ( Long id ) {
		this.id = id;
	}

	public User ( Long id , String email , String password ) {
		this.id        = id;
		this.email     = email;
		this.password  = password;
	}

	public User ( Long id , String email , String firstname , String lastname , String password ) {
		this.id        = id;
		this.email     = email;
		this.firstname = firstname;
		this.lastname  = lastname;
		this.password  = password;
	}

	public Long getId ( ) {
		return id;
	}

	public void setId ( Long id ) {
		this.id = id;
	}

	public String getEmail ( ) {
		return email;
	}

	public void setEmail ( String email ) {
		this.email = email;
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

	public String getPassword ( ) {
		return password;
	}

	public void setPassword ( String password ) {
		this.password = password;
	}
	public String getPasswordConfirm() {
		return passwordConfirm;
	}

	public void setPasswordConfirm(String passwordConfirm) {
		this.passwordConfirm = passwordConfirm;
	}


	@Override
	public String toString ( ) {
		return "=========== User =========" +
		       "\nid: " + id +
		       "\nemail: " + email +
		       "\nfirstname: " + firstname +
		       "\nlastname: " + lastname +
		       "\npassword:" + password ;
	}
}
