package com.userapp.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


public class UserRepository {
	
	@GetMapping("users")
	public List<User> getUsers(){
		
		
		List<User> users = new ArrayList();
		
		//user1
		User user1 = new User();
		user1.setUserId(100);
		user1.setName("Macus");;
		user1.setDate("20-03-1999");
		
		//user2
		User user2 = new User();
		user2.setUserId(1002);
		user2.setName("Ephrem");;
		user2.setDate("20-03-1980");
		
		//users
		users.add(user1);
		users.add(user2);
		
		
		return users;
	}


}
