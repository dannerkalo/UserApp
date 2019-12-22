package com.userapp.demo;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserResource {
	
	//instance of user repository 
	UserRepository repo = new UserRepository();
	
	
	  @GetMapping("/users")
		public List<User> getUsers(){
			
			System.out.println("Get user is running");
			
			return repo.getUsers();
		}

}
