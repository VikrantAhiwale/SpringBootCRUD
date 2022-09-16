package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.UserRepository;
import com.example.demo.Model.User;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userrepository;
	@Override
	public User saveUserData(User user) {
		return userrepository.save(user);
		
	}

	@Override
	public Optional<User> getUserData(Integer id) {
		Optional<User> us=userrepository.findById(id);
		return us;
	}

	@Override
	public void DeleteUserData(Integer id) {
		userrepository.deleteById(id);
		
	}

	@Override
	public User findbyname(String name) {
		User l=userrepository.findByName(name);
		return l;
	}

}
