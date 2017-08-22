package org.stajprojesi.MarketOtomasyonu.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserModel {
		private int id;
		private String username,password,firstname,lastname,role;
		
		
		public UserModel() {
			super();
		}


		public UserModel(int id, String username, String password, String firstname, String lastname, String role) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
			this.firstname = firstname;
			this.lastname = lastname;
			this.role = role;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getUsername() {
			return username;
		}


		public void setUsername(String username) {
			this.username = username;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
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


		public String getRole() {
			return role;
		}


		public void setRole(String role) {
			this.role = role;
		}
		
		
		
		
}
