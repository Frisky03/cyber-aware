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

import com.glesh.cyberaware.Entity.AdminEntity;
import com.glesh.cyberaware.Service.AdminService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/admins")
public class AdminController {
	@Autowired
	AdminService aserv;
	
	//Create or Insert a student record
	@PostMapping("/postAdmin")
	public AdminEntity insertAdmin(@RequestBody AdminEntity admin) {
		return aserv.insertAdmin(admin);
	}
	//Read all records
	@GetMapping("/getAllAdmins")
	public List<AdminEntity> getAllAdmins(){
		return aserv.getAllAdmins();
	}
	//Update a record
	@PutMapping("/putAdmin")
	public AdminEntity putAdmin(@RequestParam int id, @RequestBody AdminEntity newAdminDetails) throws Exception{
		return aserv.putAdmin(id, newAdminDetails);
	}
	//Delete a record
	@DeleteMapping("/deleteAdmin/{id}")
	public String deleteAdmin(@PathVariable int id) {
		return aserv.deleteAdmin(id);
	}
	
}

