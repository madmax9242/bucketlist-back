package com.gatherup.app.dao;

import com.gatherup.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, String> {

//	public User findUserByEmail(String email); // don't need this bc getUserByEmail() is already present
  
}
