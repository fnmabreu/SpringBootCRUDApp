package org.delta.springboot.service;

import java.util.List;

import org.delta.springboot.model.User;

/**
 * 
 * Our controller will be using this service for all user-related operations. 
 * Service in turn uses our spring-data repository to access and update the user.
 *
 */
public interface UserService {

	User findById(Long id);
	 
    User findByName(String name);
 
    void saveUser(User user);
 
    void updateUser(User user);
 
    void deleteUserById(Long id);
 
    void deleteAllUsers();
 
    List<User> findAllUsers();
 
    boolean isUserExist(User user);
}
