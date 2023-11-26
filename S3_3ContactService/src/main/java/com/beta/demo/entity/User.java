package com.beta.demo.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
  private Integer userId;
  private String username;
  private String pasword;
  
  private List<Contact> contacts = new ArrayList<Contact>();
  
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPasword() {
	return pasword;
}
public void setPasword(String pasword) {
	this.pasword = pasword;
}



public List<Contact> getContacts() {
	return contacts;
}
public void setContacts(List<Contact> contacts) {
	this.contacts = contacts;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
/**
 * @param userId
 * @param username
 * @param pasword
 * @param contacts
 */
public User(Integer userId, String username, String pasword) {
	super();
	this.userId = userId;
	this.username = username;
	this.pasword = pasword;
	this.contacts = contacts;
}

  
}
