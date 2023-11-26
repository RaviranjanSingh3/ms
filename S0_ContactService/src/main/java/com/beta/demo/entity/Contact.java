package com.beta.demo.entity;

public class Contact {

	
	private long userId;
	private String email;
	private String contactName;
	private long cId;
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	/**
	 * 
	 */
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param userId
	 * @param email
	 * @param contactName
	 * @param cId
	 */
	public Contact(long userId, String email, String contactName, long cId) {
		super();
		this.userId = userId;
		this.email = email;
		this.contactName = contactName;
		this.cId = cId;
	}
	
}
