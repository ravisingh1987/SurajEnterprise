/**
 * 
 */
package com.suraj.mm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	private UserService userService;

	@GetMapping(value = "/findAllUser")
	public ResponseEntity<?> findAllUser() {
		logger.info("**********Inside User Controller*************{list() start}");
		List<User> userList = userService.findAllUsers();
		return new ResponseEntity(userList, HttpStatus.OK);
	}

	@GetMapping(value = "/findUserById/{id}")
	public ResponseEntity<?> findUserById(@PathVariable Long id) {
		logger.info("**********Inside User Controller*************{showUser() start}", id);
		User user = userService.findUserById(id);
		return new ResponseEntity(user, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdateUser/")
	public ResponseEntity<?> saveOrUpdateUser(@RequestBody User user) {
		logger.info("**********Inside User Controller*************{saveUser() start}", user);
		User u = userService.saveOrUpdateUser(user);
		return new ResponseEntity(u, HttpStatus.CREATED);
	}
	/*
	 * @PostMapping(value = "/updateUser/") public ResponseEntity<?>
	 * updateUser(@RequestBody User user) { logger.
	 * info("**********Inside User Controller*************{updateUser() start}");
	 * User u = userService.saveOrUpdateUser(user); return new ResponseEntity(u,
	 * HttpStatus.CREATED); }
	 */

	@DeleteMapping(value = "/deleteUser/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable Long id) {
		logger.info("**********Inside User Controller*************{delete() start}", id);
		userService.deleteUser(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
