package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.SolutionsEntity;
import com.glesh.cyberaware.Entity.UserEntity;
import com.glesh.cyberaware.Repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository urepo;
	
	//C - Create or Insert a solution record
		public UserEntity insertUser(UserEntity user) {
			return urepo.save(user);
		}
		
		//R - Read all record from the table named tbl_solution
		public List<UserEntity> getAllUsers(){
			return urepo.findAll();
		}
		public List<UserEntity> getAllUsersByUsername(String username){
			return urepo.findByUsername(username);
		}
		//U - Update a solution record
		public UserEntity putUser(int id, UserEntity newUserDetails) throws Exception {
			UserEntity user = new UserEntity();
			
			try {
				//steps in updating
				//Step 1 - search the id number of the solution
				user = urepo.findById(id).get();
				
				//Step 2 - update the record
				user.setUsername(newUserDetails.getUsername());
				user.setPassword(newUserDetails.getPassword());
				//Step 3 - save the information and return the value
				return urepo.save(user);
			}catch(NoSuchElementException nex) {
				throw new Exception("User ID Number " + id + " does not exist!");
			}
		}
		//D - Delete a solution record
		public String deleteUser(int id) {
			String msg;
			if(urepo.findById(id) != null) { //step 1 - find the reocrd
				urepo.deleteById(id);		//step 2 - delete the record
				
				msg = "User ID Number " + id + " is successfully deleted!";
			}else {
				msg = "User ID Number " + id + " is NOT found!";
			}
			return msg;
		}
}