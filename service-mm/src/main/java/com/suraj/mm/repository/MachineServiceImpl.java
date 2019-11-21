package com.suraj.mm.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.Machine;
import com.suraj.mm.service.MachineService;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class MachineServiceImpl implements MachineService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MachineRepository machineRepository;

	@Override
	public Iterable<Machine> listAllMachine() {
		logger.info("listAllMachine called");
		return machineRepository.findAll();
	}

	@Override
	public Machine getMachineById(Long id) {
		logger.info("getMachineById called");
		return machineRepository.findById(id).orElse(null);
	}

	@Override
	public Machine saveMachine(Machine machine) {
		logger.info("saveMachine called");
		return machineRepository.save(machine);
	}

	@Override
	public void deleteMachine(Long id) {
		logger.info("deleteMachine called");
		machineRepository.deleteById(id);

	}

}
