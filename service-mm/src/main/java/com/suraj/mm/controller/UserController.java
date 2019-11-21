/**
 * 
 */
package com.suraj.mm.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.mm.model.User;
import com.suraj.mm.repository.UserRepository;
import com.suraj.mm.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Roshan Singh
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	/*
	 * @GetMapping(value = "/findAllUser") public ResponseEntity<?> findAllUser() {
	 * List<User> users = userRepository.findAll();
	 * log.info("**********Inside User Controller*************{}", users); return
	 * new ResponseEntity(users, HttpStatus.OK); }
	 */

	@RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
	public Iterable<User> list(Model model) {
		logger.info("**********Inside User Controller*************{list() start}");
		Iterable<User> userList = userService.listAllUsers();
		return userList;
	}

	@RequestMapping(value = "/show/{id}", method = RequestMethod.GET, produces = "application/json")
	public User showUser(@PathVariable Long id, Model model) {
		logger.info("**********Inside User Controller*************{showUser() start}", id);
		User user = userService.getUserById(id);
		return user;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		logger.info("**********Inside User Controller*************{saveUser() start}", user);
		userService.saveUser(user);
		return new ResponseEntity("User saved successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User user) {
		logger.info("**********Inside User Controller*************{updateUser() start}", id);
		User storedUser = userService.getUserById(id);
		storedUser.setUserId(user.getUserId());
		storedUser.setFirstName(user.getFirstName());
		storedUser.setLastName(user.getLastName());
		userService.saveUser(storedUser);
		return new ResponseEntity("User updated successfully", HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public ResponseEntity<?> delete(@PathVariable Long id) {
		logger.info("**********Inside User Controller*************{delete() start}", id);
		userService.deleteUser(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
