package com.carcass.practice.entity;


public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", name=" + name + "]";
	}

	public String id;
	private String username;
	private String name;

	public String getId() {
		return id;
	}

	public User(String id, String username, String name) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
	}

	public String getUserName() {
		return username;
	}

	public void setUserName(String username) {
		this.username = username;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
