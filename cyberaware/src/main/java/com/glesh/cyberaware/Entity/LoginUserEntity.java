package com.glesh.cyberaware.Entity;

	import java.util.Set;

	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;


@Entity
@Table(name = "tbl_users")
public class LoginUserEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		private String name;
		private String lastName;
		private String email;
		private String password;
		private String mobile;
		private String status;

		@OneToMany(cascade = CascadeType.MERGE)
		private Set<LoginRoleEntity> role;

		public LoginUserEntity ( ) {}

		public LoginUserEntity(int id, String name, String lastName, String email, String password, String mobile,
				String status, Set<LoginRoleEntity> role) {
			super();
			this.id = id;
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.mobile = mobile;
			this.status = status;
			this.role = role;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public String getMobile() {
			return mobile;
		}


		public void setMobile(String mobile) {
			this.mobile = mobile;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		public Set<LoginRoleEntity> getRole() {
			return role;
		}


		public void setRole(Set<LoginRoleEntity> role) {
			this.role = role;
		}





	}


