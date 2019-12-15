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
import com.suraj.mm.model.Machine;
import com.suraj.mm.service.CapacityService;
import com.suraj.mm.service.MachineService;

import lombok.extern.slf4j.Slf4j;
/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/machine")
public class MachineController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private MachineService machineService;

	@GetMapping(value = "/findAllMachine")
	public ResponseEntity<?> findAllMachine() {
		List<Machine> machineList = machineService.findAllMachine();
		return new ResponseEntity(machineList, HttpStatus.OK);
	}

	@GetMapping(value = "/findMachineById/{id}")
	public ResponseEntity<?> findMachineById(@PathVariable Long id) {
		Machine machine = machineService.findMachineById(id);
		return new ResponseEntity(machine, HttpStatus.OK);
	}

	@PostMapping(value = "/saveOrUpdateMachine/")
	public ResponseEntity<?> saveOrUpdateMachine(@RequestBody Machine machine) {
		Machine m = machineService.saveOrUpdateMachine(machine);
		return new ResponseEntity(m, HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteMachine/{id}")
	public ResponseEntity<?> deleteMachine(@PathVariable Long id) {
		machineService.deleteMachine(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);

	}
}
