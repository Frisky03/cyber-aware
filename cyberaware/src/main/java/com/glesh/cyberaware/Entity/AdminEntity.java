package com.glesh.cyberaware.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_clients")
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	
	@OneToOne(cascade = CascadeType.ALL)
	private UserEntity user;
	
	
	public AdminEntity(int id, String firstname, String lastname, UserEntity user) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.user = user;
	}
	public AdminEntity() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		user.setType("A");
		this.user = user;
	}
	
}
