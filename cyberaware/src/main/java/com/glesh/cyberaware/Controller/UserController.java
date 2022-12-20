package com.glesh.cyberaware.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glesh.cyberaware.Entity.SolutionsEntity;
import com.glesh.cyberaware.Entity.UserEntity;
import com.glesh.cyberaware.Service.UserService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userv;
	
	//Create or Insert a student record
	@PostMapping("/postUser")
	public UserEntity insertUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
	}
	@PostMapping("/login")
	public UserEntity loginUser(@RequestBody UserEntity user) {
		return userv.insertUser(user);
	}
	//Read all records
	@GetMapping("/getAllUsers")
	public List<UserEntity> getAllUsers(){
		return userv.getAllUsers();
	}
	@GetMapping("/getByUsername")
	public List<UserEntity> getByUsername(@RequestParam String username){
		return userv.getAllUsersByUsername(username);
	}
	//Update a record
	@PutMapping("/putUser")
	public UserEntity putUser(@RequestParam int id, @RequestBody UserEntity newUserDetails) throws Exception{
		return userv.putUser(id, newUserDetails);
	}
	//Delete a record
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return userv.deleteUser(id);
	}
	
}