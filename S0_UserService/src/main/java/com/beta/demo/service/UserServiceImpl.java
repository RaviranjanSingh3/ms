package com.beta.demo.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.beta.demo.entity.User;

@Service
public class UserServiceImpl implements UserService{
	
	//fake user list
	Stream s =Stream.of(new User(1,"ravi","fjsknkj"),
			new User(2,"raj","karanApna"),
			new User(3,"kaj","short")); 
	List<User> list=(List<User>) s.collect(Collectors.toList());

	@Override
	public User getUser(int userId) {
		
		return this.list.stream().filter(user -> user.getUserId().equals(Integer.valueOf(userId))).findAny().orElse(null);
	}

	
}
