package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Capacity;

/**
 * @author Dilip Kirar
 *
 */
public interface CapacityService {

	List<Capacity> findAllCapacity();

	Capacity findCapacityById(Long id);

	Capacity saveOrUpdateCapacity(Capacity capacity);

	Integer deleteCapacity(Long id);
}
