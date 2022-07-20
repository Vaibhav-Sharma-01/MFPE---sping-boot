package com.vstg.encryption.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AppUser {

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String username;
	private String emailId;
	private String password;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return username;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AppUser(Long id, String username, String emailId,String password) {
		this.id = id;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
	}
	public AppUser() {
		
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
