package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.User;
import com.suraj.mm.repository.UserRepository;

/**
 * @author Roshan Singh
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class UserServiceImpl implements UserService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserRepository userRepository;

	@Override
	public Iterable<User> listAllUsers() {
		logger.info("listAllUsers called");
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long id) {
		logger.info("getUserById called");
		return userRepository.findById(id).orElse(null);
	}

	@Override
	public User saveUser(User user) {
		logger.info("saveUser called");
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		logger.info("deleteUser called");
		userRepository.deleteById(id);
	}
}
