package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.ClientEntity;
import com.glesh.cyberaware.Repository.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository crepo;
	
	//C - Create or Insert a solution record
		public ClientEntity insertClient(ClientEntity client) {
			return crepo.save(client);
		}
		
		//R - Read all record from the table named tbl_solution
		public List<ClientEntity> getAllClients(){
			return crepo.findAll();
		}
		
		//U - Update a solution record
		public ClientEntity putClient(int id, ClientEntity newClientDetails) throws Exception {
			ClientEntity client = new ClientEntity();
			
			try {
				//steps in updating
				//Step 1 - search the id number of the solution
				client = crepo.findById(id).get();
				
				//Step 2 - update the record
				client.setFirstname(newClientDetails.getFirstname());
				client.setLastname(newClientDetails.getLastname());
				client.setAddress(newClientDetails.getAddress());
				client.setBirthday(newClientDetails.getBirthday());
				client.setEmail(newClientDetails.getEmail());
				client.setUser(newClientDetails.getUser());
				//Step 3 - save the information and return the value
				return crepo.save(client);
			}catch(NoSuchElementException nex) {
				throw new Exception("Client ID Number " + id + " does not exist!");
			}
		}
		//D - Delete a solution record
		public String deleteClient(int id) {
			String msg;
			if(crepo.findById(id) != null) { //step 1 - find the reocrd
				crepo.deleteById(id);		//step 2 - delete the record
				
				msg = "Client ID Number " + id + " is successfully deleted!";
			}else {
				msg = "Client ID Number " + id + " is NOT found!";
			}
			return msg;
		}
}
