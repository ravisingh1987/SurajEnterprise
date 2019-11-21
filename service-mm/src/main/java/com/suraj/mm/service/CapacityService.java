package com.suraj.mm.service;

import com.suraj.mm.model.Capacity;

/**
 * @author Dilip Kirar
 *
 */
public interface CapacityService {

	Iterable<Capacity> listAllCapacity();

	Capacity getCapacityById(Long id);

	Capacity saveCapacity(Capacity capacity);

	void deleteCapacity(Long id);
}
