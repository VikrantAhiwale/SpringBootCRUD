package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Service.UserService;

@RestController
@RequestMapping("/user")
public class Controller {
	@Autowired
	private UserService userservice;
	
	@PostMapping("/s")
	public User saveAllData(@RequestBody User user){
		User u1=userservice.saveUserData(user);
		return u1;
	}
	@GetMapping("/get/{id}")
	public Optional<User> getuserdata(@PathVariable Integer id) {
		Optional<User> u2=userservice.getUserData(id);
		return u2;
	}
	
	@GetMapping("/getname/{name}")
	 public User getbyname(@PathVariable ("name") String name) {
		 User us=userservice.findbyname(name);
		 return us;
	 }
	
	
	
	
	@DeleteMapping("/delete/{id}")
	public void deletedata(@PathVariable Integer id) throws Exception {
		userservice.DeleteUserData(id);
		
	}
	

}
