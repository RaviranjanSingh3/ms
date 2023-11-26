package com.beta.demo.entity;

public class Contact {

	
	private Long userId;
	private String email;
	private String contactName;
	private Long cId;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
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
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
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
	public Contact(Long userId, String email, String contactName, Long cId) {
		super();
		this.userId = userId;
		this.email = email;
		this.contactName = contactName;
		this.cId = cId;
	}
	
}
