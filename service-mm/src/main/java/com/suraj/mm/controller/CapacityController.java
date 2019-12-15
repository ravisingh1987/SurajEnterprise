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

import com.suraj.mm.model.Capacity;
import com.suraj.mm.service.CapacityService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/capacity")
public class CapacityController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CapacityService capacityService;

	@GetMapping(value = "/findAllCapacity")
	public ResponseEntity<?> findAllCapacity() {
		List<Capacity> capacityList = capacityService.findAllCapacity();
		return new ResponseEntity(capacityList, HttpStatus.OK);
	}

	@GetMapping(value = "/findCapacityById/{id}")
	public ResponseEntity<?> findCapacityById(@PathVariable Long id) {
		Capacity capacity = capacityService.findCapacityById(id);
		return new ResponseEntity(capacity, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdateCapacity/")
	public ResponseEntity<?> saveOrUpdateCapacity(@RequestBody Capacity capacity) {
		Capacity c = capacityService.saveOrUpdateCapacity(capacity);
		return new ResponseEntity(c, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteCapacity/{id}")
	public ResponseEntity<?> deleteCapacity(@PathVariable Long id) {
		capacityService.deleteCapacity(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
