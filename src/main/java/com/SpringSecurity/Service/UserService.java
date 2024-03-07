package com.SpringSecurity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringSecurity.Model.User;
@Service
public class UserService {
	List<User> list = new ArrayList<>();

	public UserService() {
		list.add(new User("abc","abc","ABC@gmail.com"));
		list.add(new User("xyz","xyz","XYZ@gamil.com"));
		list.add(new User("def", "def", "DEF@gmail.com"));
	}
	//get all users
	public List<User> getAllUsers(){
		return this.list;
		
	}
	//class ka obj banta h interface ka nahi
	//get single users
	public User getUser(String Username) {
		return this.list.stream().filter((user)->user.getUsername().equals(Username)).findAny().orElse(null);
		
	}
	//add user
	public User addUser(User user) {
		this.list.add(user);
		return user;
		
	
	}
	

}
