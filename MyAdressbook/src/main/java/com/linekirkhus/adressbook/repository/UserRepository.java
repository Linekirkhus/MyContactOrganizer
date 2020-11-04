package com.linekirkhus.adressbook.repository;

import com.linekirkhus.adressbook.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByEmail(String email);
	User findByFirstname(String firstname);
	User findByLastname(String lastname);
}
