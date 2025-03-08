package com.restapi.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.restapi.model.User;
import com.restapi.service.UserService;

import java.util.List;

// @RestController: Combines @Controller and @ResponseBody to handle web requests.
// @RequestMapping: Sets the base URL for all endpoints in this controller.
@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired // Automatically injects the UserService dependency.
    private UserService userService;

    // Handles POST requests to create a new user.
    @PostMapping
    public User createUser(@RequestBody User user) {
        // @RequestBody maps the incoming JSON to a User object.
        return userService.saveUser(user);
    }

    // Handles GET requests to retrieve all users.
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}