package com.oodles.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.oodles.model.UserDetails;
import com.oodles.service.UserDetailsService;

@RestController
@RequestMapping("/api")
public class UserDetailsController {
	@Autowired
	private UserDetailsService userService;
	@PostMapping("/user")
	public UserDetails addUser(@RequestBody UserDetails user) {
		return userService.addUser(user);
	}
	@PostMapping("/users")
	public List<UserDetails> addUsers(@RequestBody List<UserDetails> user) {
		return userService.addUsers(user);
	}
	@GetMapping("/getuser")
	public  List<UserDetails> getUsers() {
		return userService.getUsers();
    }

	@GetMapping("/userByid/{id}")
	public UserDetails findById(@PathVariable int id) {
		return userService.getUserById(id);
    }

	@DeleteMapping("/delete/{id}")
	public String deleteuserById( @PathVariable int id) {
		return userService.deleteuserById(id);
	}
	@PutMapping("/update")
	public  UserDetails updateUser(@RequestBody UserDetails user) {
		return userService.updateUser(user);
	}
	
}
