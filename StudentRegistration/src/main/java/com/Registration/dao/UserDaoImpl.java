package com.Registration.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Registration.respository.UserRespository;
import com.Registration.model.User;

@Service
public class UserDaoImpl implements UserDao{
	
	@Autowired
	UserRespository UserRespository;

	@Override
	public void addUser(User user) {
		
		UserRespository.save(user);
	}
	
	@Override
	public List<User> getAllUser() {
		
		List<User> userList = UserRespository.findAll();
		return userList;
	}
	
	@Override
	public User getUserById(int userId) {
		
		User user = UserRespository.getById(userId);
		return user;
		
	}
	
	@Override
	public void updateUser(User user) {
		UserRespository.save(user);
	}
	
	
	@Override
	public void deleteUser(int userId) {
		UserRespository.deleteById(userId);
	}
	
	@Override
	public User validateUser(User user) {
		
		User user1 = UserRespository.findByLoginData(user.getUserName(), user.getUserPassword());
		return user1;
	}
	
}
