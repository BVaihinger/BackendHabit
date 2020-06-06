package com.bryan.spring.datatransfers;

import com.bryan.spring.models.User;

public class UserDTO {
	
	private long id;
	private String username;
	private String password;
	private String email;
	private String fName;
	private String lName;
	
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(User user) {
		this.id = user.getId();
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.email = user.getEmail();
		this.fName = user.getfName();
		this.lName = user.getlName();
	}
	
	public UserDTO(long id, String username, String password, String email, String fName, String lName) {
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
