package com.learn_spring.entity;

import jakarta.persistence.*;

@Entity
public class User {
	@Id
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String password;

	public User() {
		super();
	}
	public User(String id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
}

/*
3 API  for user -> create, getAll, delete:
1. controller
2. Service
3. Repository

Global Exception handler
1 table

*/