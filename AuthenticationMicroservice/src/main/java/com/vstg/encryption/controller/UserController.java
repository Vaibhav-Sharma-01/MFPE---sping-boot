package com.vstg.encryption.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.vstg.encryption.models.AppUser;
import com.vstg.encryption.services.UserServiceImpl;

@RestController
@CrossOrigin
@RequestMapping("/auth")
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	@PostMapping("/login/save")
	public ResponseEntity<AppUser> saveUser(@RequestBody AppUser user){
		URI uri = URI.create(ServletUriComponentsBuilder.fromCurrentContextPath().path("/auth/user/save").toUriString());
		return ResponseEntity.created(uri).body(service.saveUser(user));
	}
	
	@GetMapping("/user/{username}")
	public ResponseEntity<AppUser> getUser(@PathVariable("username")String username){
		return ResponseEntity.ok().body(service.getUser(username));
	}
	
}
