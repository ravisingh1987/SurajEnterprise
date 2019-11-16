/**
 * 
 */
package com.suraj.mm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.mm.model.User;
import com.suraj.mm.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Roshan Singh
 *@version 1.0
 */
@Slf4j
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@GetMapping(value="/findAllUser")
	public ResponseEntity<?> findAllUser(){
		List<User> users=userRepository.findAll();
		log.info("**********Inside User Controller*************{}",users);
		return new ResponseEntity(users,HttpStatus.OK);
	}
}
