package com.Registration.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Registration.model.User;

@Repository
public interface UserRespository extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.userName=(:userName) and u.userPassword=(:userPassword)")
	User findByLoginData(String userName, String userPassword);


}
