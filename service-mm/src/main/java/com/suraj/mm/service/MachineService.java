package com.suraj.mm.service;

import com.suraj.mm.model.Machine;

/**
 * @author Dilip Kirar
 *
 */
public interface MachineService {

	Iterable<Machine> listAllMachine();

	Machine getMachineById(Long id);

	Machine saveMachine(Machine machine);

	void deleteMachine(Long id);
}
