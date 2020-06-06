package com.bryan.spring.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bryan.spring.repositories.UserRepository;
import com.bryan.spring.datatransfers.LoginDTO;
import com.bryan.spring.exceptions.ResourceNotFoundException;
import com.bryan.spring.models.User;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@PostMapping("/users/login")
	public User getUserForLogin(@RequestBody LoginDTO logInfo) {
		return userRepo.checkValidLogin(logInfo.getUsername(), logInfo.getPassword());
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserByID(@PathVariable(value="id") Long userId)
		throws ResourceNotFoundException{
		User user = userRepo.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
		return ResponseEntity.ok().body(user);
	}
	
	
	
	
	
}
