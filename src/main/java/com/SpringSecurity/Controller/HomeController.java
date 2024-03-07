package com.SpringSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringSecurity.Model.Users;
import com.SpringSecurity.Service.UsersService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private UsersService UserService;
	
	//http://localhost:8081/home/users
	@GetMapping("/users")
	public List<Users> getUser() {
		System.out.println("getting users");
		return UserService.getUsers();
	}

}
