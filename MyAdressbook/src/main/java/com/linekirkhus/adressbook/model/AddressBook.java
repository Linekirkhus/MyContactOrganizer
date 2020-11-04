package com.linekirkhus.adressbook.model;

import java.util.*;

public class AddressBook {

	private Long          id;
	private String        name;
	private List<Contact> contacts;
	private Contact       contact;

	public AddressBook ( Contact contact ) {
		this.contact = contact;
	}

	public AddressBook ( ) {
	}

	public AddressBook ( String name , List<Contact> contacts ) {
		this.name     = name;
		this.contacts = contacts;
	}

	public AddressBook ( String name ) {
		this.name = name;
	}

	public AddressBook ( List<Contact> contacts ) {
		this.contacts = contacts;
	}
}
/*
private Map<Person, Address> myContacts = new ConcurrentHashMap<Person,Address> ();
	public void addContact ( Person person , Address address ) {
		this.myContacts.put ( person , address );
	}
	public void removeContact ( Person person ) {
		this.myContacts.remove ( person );
	}
	public Map<Person, Address> getMyContacts ( ) {
		return myContacts;
	}
	public void setMyContacts ( Map<Person, Address> myContacts ) {
		this.myContacts = myContacts;
	}
	public AddressBook ( Map<Person, Address> myContacts ) {
		this.myContacts = myContacts;
	}
 */