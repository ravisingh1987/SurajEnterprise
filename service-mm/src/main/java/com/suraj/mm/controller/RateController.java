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

import com.suraj.mm.model.Rate;
import com.suraj.mm.service.RateService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/rate")
public class RateController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private RateService rateService;

	@GetMapping(value = "/findAllRate")
	public ResponseEntity<?> findAllRate() {
		List<Rate> rateList = rateService.findAllRate();
		return new ResponseEntity(rateList, HttpStatus.OK);
	}

	@GetMapping(value = "/findRateById/{id}")
	public ResponseEntity<?> findRateById(@PathVariable Long id) {
		Rate rate = rateService.findRateById(id);
		return new ResponseEntity(rate, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdateRate/")
	public ResponseEntity<?> saveOrUpdateRate(@RequestBody Rate rate) {
		Rate r = rateService.saveOrUpdateRate(rate);
		return new ResponseEntity(r, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteRate/{id}")
	public ResponseEntity<?> deleteRate(@PathVariable Long id) {
		rateService.deleteRate(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
