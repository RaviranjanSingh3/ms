package com.beta.demo.service;

import java.util.List;

import com.beta.demo.entity.Contact;

public interface ContactService {

	public List<Contact> getContactByUser(Long userId);
}
