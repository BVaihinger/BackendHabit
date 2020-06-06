package com.bryan.spring.models;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private String fName;
	@Column
	private String lName;
	
	
	/*
	//Would be nice to have, but not needed for MVP
	@CreationTimestamp
	private LocalDateTime createdTime;
	
	@UpdateTimestamp
	private LocalDateTime updatedTime;
	*/
	
	public User() {
		super();
	}
	
	public User(String username, String password, String email, String fName, String lName) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
	}
	
	public User(long id, String username, String password, String email, String fName, String lName) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.fName = fName;
		this.lName = lName;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	


}
