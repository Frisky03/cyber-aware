package com.glesh.cyberaware.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glesh.cyberaware.Entity.LoginUserEntity;
import com.glesh.cyberaware.Service.LoginService;

@RestController
@RequestMapping("/user")

public class LoginController {
	
	@Autowired
	LoginService lserv;
	
	@PostMapping("/postUser")
	public LoginUserEntity insertUser(@RequestBody LoginUserEntity user) {
		return lserv.insertUser(user);
	}
	
	@GetMapping("/getAllId")
	public List<LoginUserEntity> getAllId(){
		return lserv.getAllId();
	}
	
	@PutMapping("/putId")
	public LoginUserEntity putId(@RequestParam int id, @RequestBody LoginUserEntity newUserDetails) throws Exception{
		return lserv.putId(id,newUserDetails);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteUser(@PathVariable int id) {
		return lserv.deleteUser(id);
	}
}