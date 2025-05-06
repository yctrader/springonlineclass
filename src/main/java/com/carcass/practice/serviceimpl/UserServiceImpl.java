package com.carcass.practice.serviceimpl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carcass.practice.entity.User;
import com.carcass.practice.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	List<User> al = new ArrayList<>();

	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		for(User u:al)
		{
		if(u.getId().equals(id))
		{
			u.setName(user.getName());
			u.setUserName(user.getUserName());
		}
		}
		return null;
	}

	public User deleteUser(String id) {
		// TODO Auto-generated method stub
			for(User u:al)
			{
				if(u.getId().equals(id)) al.remove(u);
				return u;
			}
		return null;
	}

	public User register(User user) {
		// TODO Auto-generated method stub
		al.add(user);
		return user;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return al;
	}

}
