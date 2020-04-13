package com.stacksimplify.restservices.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stacksimplify.restservices.spring.entities.User;

//Repository
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
