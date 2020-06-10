package com.gatherup.app.service.impl;

import com.gatherup.app.dao.UserDao;
import com.gatherup.app.model.Event;
import com.gatherup.app.model.User;
import com.gatherup.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
	Class implements CRUD methods
 */
@Service // marks this class as a service provider; autowires this class to it's interface
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	// CREATE
	@Override
	public User createUser(User user) {
		User retUsr = null;
		if(getUserByEmail(user.getEmail()) == null){
			retUsr = userDao.save(user);
			System.out.println("I am creating a new user");
		}else {
			System.out.println("I already exist");
		}
		return retUsr;
	}

	// UPDATE
	@Override
	public User updateUser(User user) {
		return userDao.save(user);
	}

	// READ
	@Override
	public List<User> getAllUsers() {
		return userDao.findAll();
	}

	@Override
	public User getUserById(int id) {
		User retUser = null;
		Optional<User> usr = userDao.findById(id);
		if(usr != null) {
			retUser = usr.get();
		}
		
		
		
		return retUser;
	}

	@Override
	public User getUserByEmail(String email) {
		return userDao.findUserByEmail(email);
	}

	// DELETE
	@Override
	public void deleteUserById(int id) {
		userDao.deleteById(id);
	}
}
