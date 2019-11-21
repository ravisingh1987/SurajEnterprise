package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.Capacity;
import com.suraj.mm.repository.CapacityRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class CapacityServiceImpl implements CapacityService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CapacityRepository capacityRepository;

	@Override
	public Iterable<Capacity> listAllCapacity() {
		logger.info("listAllCapacity called");
		return capacityRepository.findAll();
	}

	@Override
	public Capacity getCapacityById(Long id) {
		logger.info("getCapacityById called");
		return capacityRepository.findById(id).orElse(null);
	}

	@Override
	public Capacity saveCapacity(Capacity capacity) {
		logger.info("saveCapacity called");
		return capacityRepository.save(capacity);
	}

	@Override
	public void deleteCapacity(Long id) {
		logger.info("deleteCapacity called");
		capacityRepository.deleteById(id);

	}

}
