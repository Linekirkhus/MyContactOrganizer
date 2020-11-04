package com.linekirkhus.adressbook;

import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MyAddressBookApplication {

	public static void main ( String[] args ) {
		SpringApplication.run(MyAddressBookApplication.class , args );
	}


	@Bean
	RestTemplate restTemplate ( RestTemplateBuilder builder ) {
		return builder.build ();
	}

	@Configuration
	public static class ServerConfig {
		@Bean
		public ConfigurableServletWebServerFactory webServerFactory ( ) {
			TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory ();
			factory.addErrorPages ( new ErrorPage ( HttpStatus.FORBIDDEN , "/403" ) );
			return factory;
		}

		@Bean
		public PolicyFactory getUserHtmlPolicy ( ) {
			return new HtmlPolicyBuilder ().allowCommonBlockElements ().allowCommonInlineFormattingElements ().toFactory ();
		}
	}






		/*
		List<Contact>myContactList = new ArrayList<Contact>();
		Person  p1            = new Person("Line", "Kirkhus", "41214236", "line@line.no");
		System.out.println ("This is p1: " + p1.toString ());
		Address a1 = new Address ("Bydøy allee", "25", "0361", "Oslo");


		Contact c1            = new Contact (p1, new Address( "Bokfink veien", "6", "4022", "Stavanger") );

		myContactList.add ( c1 );
		Contact c2 = new Contact ( new Person ("Lilly", "Keeps", "42345678", "lilly@keeps.no"), new Address ("Thorvald Meyers gate", "33", "3168", "Oslo") );
		Contact c3 = new Contact ( new Person ("Leah", "Kenning", "43456789", "leah@kenning.no"), new Address ("Louises gate", "1", "3168", "Oslo") );
		Contact c4 = new Contact ( new Person ("Linda", "Kanvas", "44567890", "linda@kanvas.no"), new Address ("Olav Helsets gate ", "1", "3168", "Oslo") );
		Contact c5 = new Contact ( new Person ("Laila", "Kenza", "45678901", "laila@kenza.no"), new Address ("Huitfeldts gate ", "3", "3168", "Oslo") );
		Contact c6 = new Contact ( new Person ("Lizzy", "Kentish", "46789012", "lizzy@kentish.no"), new Address ("Fjell gata", "61", "3168", "Oslo") );

		AddressBook addressBook = new AddressBook (myContactList);
		myContactList.add ( c2 );
		myContactList.add ( c3 );
		myContactList.add ( c4 );
		myContactList.add ( c5 );
		myContactList.add ( c6 );
		System.out.println ("Size" + myContactList.size ());
		System.out.println ("Collections singletons list: " + Collections.singletonList ( myContactList ) );

		System.out.println ("This is in my address book" + addressBook.toString ());


		 */

	}



