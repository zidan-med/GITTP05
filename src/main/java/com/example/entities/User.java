package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String userName;
	private String password;
	private boolean active;
	private String roles;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	/*
	 * public User() { super(); }
	 * 
	 * public User(String userName, String password, boolean active, String roles) {
	 * super(); this.userName = userName; this.password = password; this.active =
	 * active; this.roles = roles; }
	 * 
	 * public User(long id, String userName, String password, boolean active, String
	 * roles) { super(); this.id = id; this.userName = userName; this.password =
	 * password; this.active = active; this.roles = roles; }
	 */

	/*
	 * @Override public String toString() { return "User [userName=" + userName +
	 * ", password=" + password + ", active=" + active + ", roles=" + roles + "]"; }
	 */
	

}
