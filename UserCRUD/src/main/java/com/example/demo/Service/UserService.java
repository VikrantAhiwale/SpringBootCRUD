package com.example.demo.Service;

import java.util.Optional;

import com.example.demo.Model.User;

public interface UserService {

	
	public User saveUserData(User user);
	public Optional<User> getUserData(Integer id);
	public void DeleteUserData(Integer id);
	public User findbyname(String name);
}
