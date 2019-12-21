package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.mm.model.Capacity;
import com.suraj.mm.model.Machine;
import com.suraj.mm.model.Rate;
import com.suraj.mm.repository.MachineRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the Machine Entity
 */
@Service
public class MachineServiceImpl implements MachineService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MachineRepository machineRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Machine> findAllMachine() {
		logger.info("listAllMachine called");
		List<Machine> machine = machineRepository.findAll();
		return machine.isEmpty() ? null : machine;

	}

	@Transactional(readOnly = true)
	@Override
	public Machine findMachineById(Long id) {
		logger.info("getMachineById called");
		return machineRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public Machine saveOrUpdateMachine(Machine machine) {
		logger.info("saveMachine called");
		Machine m = machineRepository.save(machine);
		return m == null ? null : m;
	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteMachine(Long id) {
		logger.info("deleteMachine called");
		Machine machine = findMachineById(id);
		machine.setIsActive("0");
		saveOrUpdateMachine(machine);
		return 0;

	}

}
