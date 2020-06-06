package com.bryan.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bryan.spring.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
	public User checkValidLogin(@Param("username") String uName, @Param("password") String pass);
	
	
}
