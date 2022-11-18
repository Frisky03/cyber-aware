package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.LoginUserEntity;
import com.glesh.cyberaware.Repository.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	LoginRepository lrepo;
	
	
	public LoginUserEntity insertUser(LoginUserEntity user) {
		return lrepo.save(user);
	}
	
	public List<LoginUserEntity> getAllId(){
		return lrepo.findAll();
	}
	
	public LoginUserEntity putId(int id, LoginUserEntity newUserDetails) throws Exception{
		LoginUserEntity user = new LoginUserEntity();
		
		try {
			user = lrepo.findById(id).get();
			user.setStatus(newUserDetails.getStatus());
			user.setEmail(newUserDetails.getEmail());	
			return lrepo.save(user);
		}catch(NoSuchElementException nex) {
			throw new Exception("User ID " + id + "does not exist!");
		}
	}
	
	public String deleteUser(int id) {
		String msg;
		if(lrepo.findById(id) != null) {
			lrepo.deleteById(id);
			msg = "User ID " + id + " is successfully deleted!";
		}
		else
			msg = "User ID " + id + " is NOT found!";
		return msg;
	}
}
