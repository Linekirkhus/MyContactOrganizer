package com.linekirkhus.adressbook.model;



public class Contact {


	private Person person;
	private Address address;


	public Contact ( Contact contact) {
		person = getPerson ();
		address = getAddress ();
	}

	public Contact ( Person person , Address address ) {
		this.person  = person;
		this.address = address;
	}

	public Person getPerson ( ) {
		return person;
	}

	public void setPerson ( Person person ) {
		this.person = person;
	}

	public Address getAddress ( ) {
		return address;
	}

	public void setAddress ( Address address ) {
		this.address = address;
	}

	@Override
	public String toString ( ) {
		return "Contact: " +
		       "\nPerson: " + person +
		       "\nAddress: " + address ;
	}
}
