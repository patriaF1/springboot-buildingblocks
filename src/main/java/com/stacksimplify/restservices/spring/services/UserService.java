package com.stacksimplify.restservices.spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stacksimplify.restservices.spring.entities.User;
import com.stacksimplify.restservices.spring.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	//getAllUsers Method
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//CreateUser Method
	public User createUser(User user){
		return userRepository.save(user);
	}
	
	//GetUserById Method
	public Optional<User> getUserById(Long id){
		Optional<User> user = userRepository.findById(id);
		return user;
	}
	
	//UpdateUserById
	public User updateUserById(Long id, User user){
		user.setId(id);
		return userRepository.save(user);		
	}
	
	//DeleteUserById
	public void deleteUserById(Long id){
		if (userRepository.findById(id).isPresent()) {
			userRepository.deleteById(id);
		}
	}
	
	//GetUserById Method
	public User getUserByUsername(String username){
		return userRepository.findByUsername(username);
	}
}
