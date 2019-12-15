package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Machine;

/**
 * @author Dilip Kirar
 *
 */
public interface MachineService {

	List<Machine> findAllMachine();

	Machine findMachineById(Long id);

	Machine saveOrUpdateMachine(Machine machine);

	Integer deleteMachine(Long id);
}
