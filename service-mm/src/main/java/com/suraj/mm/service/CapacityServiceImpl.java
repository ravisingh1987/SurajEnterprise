package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.mm.model.Capacity;
import com.suraj.mm.model.User;
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

	@Transactional(readOnly = true)
	@Override
	public List<Capacity> findAllCapacity() {
		logger.info("findAllCapacity called");
		List<Capacity> capacity = capacityRepository.findAll();
		return capacity.isEmpty() ? null : capacity;
	}

	@Transactional(readOnly = true)
	@Override
	public Capacity findCapacityById(Long id) {
		logger.info("findCapacityById called");
		return capacityRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public Capacity saveOrUpdateCapacity(Capacity capacity) {
		logger.info("saveOrUpdateCapacity called");
		Capacity c = capacityRepository.save(capacity);
		return c == null ? null : c;

	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteCapacity(Long id) {
		logger.info("deleteCapacity called");
		Capacity capacity= findCapacityById(id);
		capacity.setCapacity_flag("0");
		saveOrUpdateCapacity(capacity);
		return 0;

	}

}
