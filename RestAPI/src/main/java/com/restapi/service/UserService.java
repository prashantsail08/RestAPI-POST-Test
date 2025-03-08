package com.restapi.service;

//Service Class
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.model.User;
import com.restapi.repository.UserRepository;

import java.util.List;

//@Service: Marks this class as a service component in the Spring context.
@Service
public class UserService {
	@Autowired // Automatically injects the UserRepository dependency.
	private UserRepository userRepository;

	// Saves a user to the database.
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	// Retrieves all users from the database.
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}