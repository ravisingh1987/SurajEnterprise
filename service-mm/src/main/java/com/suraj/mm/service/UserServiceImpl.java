package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(readOnly = true)
	@Override
	public List<User> findAllUsers() {
		logger.info("listAllUsers called");
		List<User> users = userRepository.findAll();

		return users.isEmpty() ? null : users;
	}

	@Transactional(readOnly = true)
	@Override
	public User findUserById(Long id) {
		logger.info("getUserById called");
		return userRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public User saveOrUpdateUser(User user) {
		logger.info("saveUser called");
		User u = userRepository.save(user);
		return u == null ? null : u;
	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteUser(Long id) {
		logger.info("deleteUser called");
		User u = findUserById(id);
		u.setActive("0");
		saveOrUpdateUser(u);
		return 0;
	}

	@Transactional(readOnly = true)
	@Override
	public User findByLoginName(String userName) {
		User u = userRepository.findByUserName(userName);
		return u == null ? null : u;
	}
}
