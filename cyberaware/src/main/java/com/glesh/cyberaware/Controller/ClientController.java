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

import com.glesh.cyberaware.Entity.ClientEntity;
import com.glesh.cyberaware.Service.ClientService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/clients")
public class ClientController {
	@Autowired
	ClientService cserv;
	
	//Create or Insert a student record
	@PostMapping("/postClient")
	public ClientEntity insertClient(@RequestBody ClientEntity client) {
		return cserv.insertClient(client);
	}
	//Read all records
	@GetMapping("/getAllClients")
	public List<ClientEntity> getAllClients(){
		return cserv.getAllClients();
	}
	//Update a record
	@PutMapping("/putClient")
	public ClientEntity putClient(@RequestParam int id, @RequestBody ClientEntity newClientDetails) throws Exception{
		return cserv.putClient(id, newClientDetails);
	}
	//Delete a record
	@DeleteMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable int id) {
		return cserv.deleteClient(id);
	}
	
}
