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

import com.suraj.mm.model.Work;
import com.suraj.mm.service.WorkService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/work")
public class WorkController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private WorkService workService;

	@GetMapping(value = "/findAllWorks")
	public ResponseEntity<?> findAllWorks() {
		List<Work> workList = workService.findAllWorks();
		return new ResponseEntity(workList, HttpStatus.OK);
	}

	@GetMapping(value = "/findWorkById/{id}")
	public ResponseEntity<?> findWorkById(@PathVariable Long id) {
		Work work = workService.findWorkById(id);
		return new ResponseEntity(work, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdateWork/")
	public ResponseEntity<?> saveOrUpdateWork(@RequestBody Work work) {
		Work w = workService.saveOrUpdateWork(work);
		return new ResponseEntity(w, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteWork/{id}")
	public ResponseEntity<?> deleteWork(@PathVariable Long id) {
		workService.deleteWork(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
