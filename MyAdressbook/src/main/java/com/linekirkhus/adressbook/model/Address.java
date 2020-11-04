package com.linekirkhus.adressbook.model;


import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;

	@Column(name = "streetname")
	private String street_name;

	@Column(name = "streetnumber")
	private String street_number;

	@Column(name = "postalcode")
	private String postal_code;

	@Column(name = "city")
	private String city;

	private boolean isInternational = false;

	public Address ( ) {
	}

	public Address ( String street_name , String street_number , String postal_code , String city  ) {

		this.street_name     = street_name;
		this.street_number   = street_number;
		this.postal_code     = postal_code;
		this.city            = city;

	}

	public Long getId ( ) {
		return id;
	}

	public void setId ( Long id ) {
		this.id = id;
	}

	public String getStreet_name ( ) {
		return street_name;
	}

	public void setStreet_name ( String street_name ) {
		this.street_name = street_name;
	}

	public String getStreet_number ( ) {
		return street_number;
	}

	public void setStreet_number ( String street_number ) {
		this.street_number = street_number;
	}

	public String getPostal_code ( ) {
		return postal_code;
	}

	public void setPostal_code ( String postal_code ) {
		this.postal_code = postal_code;
	}

	public String getCity ( ) {
		return city;
	}

	public void setCity ( String city ) {
		this.city = city;
	}

	public boolean isInternational ( ) {
		return isInternational;
	}

	public void setInternational ( boolean international ) {
		isInternational = international;
	}

	@Override
	public String toString ( ) {
		return "Address{" +
		       "id=" + id +
		       ", street_name='" + street_name + '\'' +
		       ", street_number=" + street_number +
		       ", postal_code=" + postal_code +
		       ", city='" + city + '\'' +
		       ", isInternational=" + isInternational +
		       '}';
	}
}
