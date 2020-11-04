package com.linekirkhus.adressbook.service;

import com.linekirkhus.adressbook.model.User;
import com.linekirkhus.adressbook.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public User findByEmail(String email){
		return userRepository.findByEmail (email);
	}
	public User findByFirstname(String firstname){
		return userRepository.findByFirstname (firstname);
	}
	public User findByLastname(String lastname){
		return userRepository.findByLastname (lastname);
	}

	public void register(User user){
		user.setFirstname (  user.getFirstname ());
		user.setLastname ( user.getLastname () );
		user.setEmail ( user.getEmail () );
		user.setPassword ( user.getPassword () );
		user.setPasswordConfirm (  user.getPasswordConfirm ());
		userRepository.save ( user );
	}

	public void save(User user) {
		userRepository.save ( user );
	}

	public User get(String email){
		return userRepository.findByEmail (email);
	}
	public User findUserByFirstname(String firstname){
		return userRepository.findByFirstname (firstname);
	}
	public User findUserByLastname(String lastname){
		return userRepository.findByLastname (lastname);
	}
	public User get(Long id){
		return userRepository.findById (id).get ();
	}

	public String getUserName(Long id){
		User user = userRepository.findById ( id ).get ();
		return user.getFirstname () + " " + user.getLastname ();
	}

	public Iterable<User> findAllUsers(){
		return userRepository.findAll ();
	}
}
