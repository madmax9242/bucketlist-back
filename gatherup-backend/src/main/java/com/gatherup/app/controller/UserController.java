package com.gatherup.app.controller;

import com.gatherup.app.model.User;
import com.gatherup.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// CREATE
	@PostMapping("/user") // localhost:9999/user
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}

	// READ
	@GetMapping("/user/all") // localhost:9999/user/all
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/user/{id}") // localhost:9999/user/{id}
	public User getUserById(@PathVariable("id") int id) {
		return userService.getUserById(id);
	}

	@GetMapping("user/email/{email}") // localhost:9999/user/email/{email}
	public User getUserByEmail(@PathVariable("email") String email) {
		return userService.getUserByEmail(email);
	}

	// UPDATE // localhost:9999/user
	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	// DELETE
	@DeleteMapping("/user/{id}") // localhost:9999/user/{id}
	public void deleteUserById(@PathVariable("id") int id) {
		userService.deleteUserById(id);
	}
}
