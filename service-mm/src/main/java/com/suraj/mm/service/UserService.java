package com.suraj.mm.service;

import com.suraj.mm.model.User;

/**
 * @author Roshan Singh
 *
 */
public interface UserService {

	Iterable<User> listAllUsers();

	User getUserById(Long id);

	User saveUser(User user);

	void deleteUser(Long id);
}
