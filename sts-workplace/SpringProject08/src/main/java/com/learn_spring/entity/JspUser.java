package com.learn_spring.entity;

import jakarta.persistence.*;

@Entity
public class JspUser {

	@Id
	private String id;
	@Column
	private String name;
	@Id
	private String userName;
	@Column
	private String password;
	

	public JspUser() {	}
	
	public JspUser(String id, String name, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "JspUser [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

}
