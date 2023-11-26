package com.beta.demo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.beta.demo.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	Stream s = Stream.of(new Contact(1,"abc@gmal","avi",2),
			new Contact(1,"vcc@gmal","ravi",2),
			new Contact(1,"abc@gmal","raj",3),
			new Contact(2,"abc@gmal","avi",4),
			new Contact(2,"vbc@gmal","avi",5),
			new Contact(3,"vbc@gmal","raj",6));
	   List<Contact> ctl= (List<Contact>) s.collect(Collectors.toList());
	   
	   public List<Contact> getContactByUser(Long userId){
		   System.out.println("hi");
		   
		   return ctl.stream().filter(c -> Long.valueOf(c.getUserId()).equals(userId)).collect(Collectors.toList());

	   }
	

}
