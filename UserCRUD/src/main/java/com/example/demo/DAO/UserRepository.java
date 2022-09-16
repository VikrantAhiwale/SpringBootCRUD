package com.example.demo.DAO;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository 
public interface UserRepository extends JpaRepository<User, Serializable>,CrudRepository<User, Serializable> {

	@Query(value="select * from Vikrant_user where name=?",nativeQuery=true)
	public User findByName(String name);
}
