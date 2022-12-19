package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.AdminEntity;
import com.glesh.cyberaware.Repository.AdminRepository;

@Service
public class AdminService {
	
	@Autowired
	AdminRepository arepo;
	
	//C - Create or Insert a solution record
		public AdminEntity insertAdmin(AdminEntity admin) {
			return arepo.save(admin);
		}
		
		//R - Read all record from the table named tbl_solution
		public List<AdminEntity> getAllAdmins(){
			return arepo.findAll();
		}
		
		//U - Update a solution record
		public AdminEntity putAdmin(int id, AdminEntity newAdminDetails) throws Exception {
			AdminEntity admin = new AdminEntity();
			
			try {
				//steps in updating
				//Step 1 - search the id number of the solution
				admin = arepo.findById(id).get();
				
				//Step 2 - update the record
				admin.setFirstname(newAdminDetails.getFirstname());
				admin.setLastname(newAdminDetails.getLastname());
				admin.setUser(newAdminDetails.getUser());

				//Step 3 - save the information and return the value
				return arepo.save(admin);
			}catch(NoSuchElementException nex) {
				throw new Exception("Admin ID Number " + id + " does not exist!");
			}
		}
		//D - Delete a solution record
		public String deleteAdmin(int id) {
			String msg;
			if(arepo.findById(id) != null) { //step 1 - find the reocrd
				arepo.deleteById(id);		//step 2 - delete the record
				
				msg = "Admin ID Number " + id + " is successfully deleted!";
			}else {
				msg = "Admin ID Number " + id + " is NOT found!";
			}
			return msg;
		}
}