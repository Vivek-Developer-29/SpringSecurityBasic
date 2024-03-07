package com.SpringSecurity.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import com.SpringSecurity.Model.Users;


@Service
public class UsersService {
	private List<Users> store = new ArrayList<>();

	public UsersService() {
		store.add(new Users(UUID.randomUUID().toString(),"Vivek","vivek@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"Motu","motu@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"Ashiish","ashish@gmail.com"));
		store.add(new Users(UUID.randomUUID().toString(),"chotu","chotu@gmail.com"));
	}

	public List<Users> getUsers() {
		
		return this.store;
	}
	

}
