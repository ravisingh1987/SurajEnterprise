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
import org.springframework.web.bind.annotation.RestController;

import com.suraj.mm.dto.MachineDTO;
import com.suraj.mm.model.Machine;
import com.suraj.mm.model.User;
import com.suraj.mm.model.UserMachineMapping;
import com.suraj.mm.service.CommonMappingService;

import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Dilip Kirar
 * @version 1.0
 */
@Slf4j
@RestController
public class CommonMappingController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CommonMappingService commonMappingService;

	/**
	 * @author Dilip Kirar need to pass entityType as user/machine for user wise and
	 *         machine wise
	 * @param entityType
	 * @return
	 */
	@ApiOperation(value = "need to pass entityType as user/machine for user wise and machine wise")
	@GetMapping(value = "/findAllUserMachineMapping/{entityType}")
	public ResponseEntity<?> findAllUserMachineMapping(@PathVariable("entityType") String entityType) {
		List<?> userMachineList = (List<?>) commonMappingService
				.findAllUserMachineMapping(entityType.equals("user") ? User.class : Machine.class);
		return new ResponseEntity(userMachineList, HttpStatus.OK);
	}

	/**
	 * Method for the Assignment of machine
	 * 
	 * @author Roshan Singh
	 * @param machineDTO
	 * @return
	 */
	@PostMapping(value = "/assignMachine/")
	public ResponseEntity<?> assignMachine(@RequestBody MachineDTO machineDTO) {
		List<UserMachineMapping> ump = commonMappingService.saveOrUpdateUserMachineMapping(machineDTO);
		return new ResponseEntity(ump, HttpStatus.CREATED);
	}

	@GetMapping(value = "/findMachineById/{machineTypeId}")
	public ResponseEntity<?> findMachineById(@PathVariable("machineTypeId") Long machineTypeId) {
		MachineDTO mdto = commonMappingService.findMachineDtoByMachineId(machineTypeId);
		return new ResponseEntity(mdto, HttpStatus.CREATED);
	}

	@PostMapping(value = "/modifyMachine/{entityType}")
	public ResponseEntity<?> modifyMachine() {
		return new ResponseEntity("", HttpStatus.CREATED);

	}

	@DeleteMapping(value = "/deleteAssgnMachine/{id}")
	public ResponseEntity<?> deleteAssgnMachine(@PathVariable Long id) {
		commonMappingService.deleteUserMachineMappingByMachineId(id);
		return new ResponseEntity("Machine deleted successfully", HttpStatus.OK);
	}

	@DeleteMapping(value = "/deleteAssgnUser/{id}")
	public ResponseEntity<?> deleteAssgnUser(@PathVariable Long id) {
		commonMappingService.deleteUserMachineMappingByUserId(id);
		return new ResponseEntity("User deleted successfully", HttpStatus.OK);
	}
}
