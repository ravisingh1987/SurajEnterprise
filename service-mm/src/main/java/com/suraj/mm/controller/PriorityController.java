package com.suraj.mm.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.mm.model.Payment;
import com.suraj.mm.model.Priority;
import com.suraj.mm.service.PaymentService;
import com.suraj.mm.service.PriorityService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/priority")
public class PriorityController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private PriorityService priorityService;

	@GetMapping(value = "/findAllPriority")
	public ResponseEntity<?> findAllPriority() {
		List<Priority> priorityList = priorityService.findAllPriority();
		return new ResponseEntity(priorityList, HttpStatus.OK);
	}

	@GetMapping(value = "/findPriorityById/{id}")
	public ResponseEntity<?> findPriorityById(@PathVariable Long id) {
		Priority priority = priorityService.findPriorityById(id);
		return new ResponseEntity(priority, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdatePriority/")
	public ResponseEntity<?> saveOrUpdatePriority(@RequestBody Priority priority) {
		Priority p = priorityService.saveOrUpdatePriority(priority);
		return new ResponseEntity(p, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deletePriority/{id}")
	public ResponseEntity<?> deletePriority(@PathVariable Long id) {
		priorityService.deletePriority(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
