package com.restapi.repository;

//Repository Interface
import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.User;
//Extends JpaRepository to provide CRUD operations for 'User' entities.
public interface UserRepository extends JpaRepository<User, Long> {}
