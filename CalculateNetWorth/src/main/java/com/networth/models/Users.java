package com.networth.models;

public class Users {
	
	private Long id;
	private String username;
	private String password;
	private String JWT;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getJWT() {
		return JWT;
	}
	public void setJWT(String jWT) {
		JWT = jWT;
	}
	public Users(Long id, String username, String password, String jWT) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		JWT = jWT;
	}
	public Users() {
		
	}
	
	
}
