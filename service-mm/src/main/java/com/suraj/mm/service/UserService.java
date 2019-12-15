package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.User;

/**
 * @author Roshan Singh
 *
 */
public interface UserService {

	List<User> findAllUsers();

	User findUserById(Long id);

	User saveOrUpdateUser(User user);

	Integer deleteUser(Long id);

	User findByLoginName(String userName);
}
