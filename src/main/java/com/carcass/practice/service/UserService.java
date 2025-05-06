package com.carcass.practice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.carcass.practice.entity.User;


public interface UserService {
	public User updateUser(String id, User user);

	public User deleteUser(String id) ;

	public User register(User user) ;

	public List<User> getAllUsers() ;
}
