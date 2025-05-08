package com.carcass.practice.controller;

import com.carcass.practice.entity.User;
import com.carcass.practice.serviceimpl.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LearningController {

		@Autowired
		private UserServiceImpl userserviceimpl;
		
		@DeleteMapping("/del/{id}")
		public User delete(@PathVariable String id)
		{
			return userserviceimpl.deleteUser(id);
			
		}
		@PostMapping("/regis")
		public User registration(@RequestBody User user)
		{
			return userserviceimpl.register(user);		
					
		}
		@PutMapping("/update/{id}")
		public User update(@PathVariable String id, @RequestBody User user)
		{
			return userserviceimpl.updateUser(id,user);
		}
		@GetMapping("/all")
		public List<User> getAllUser()
		{
			return userserviceimpl.getAllUsers();
		}
		
		@GetMapping("/try")
		public int trail()
		{
			return 10;
		}
		
		@PostMapping("/registernew")
		public ResponseEntity<User> createUSERnew(@RequestBody User user){
		user=userserviceimpl.register(user);
		
		return new ResponseEntity<User>(user,HttpStatus.OK);	
		}
}

