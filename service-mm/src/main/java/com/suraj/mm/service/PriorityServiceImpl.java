package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.Priority;
import com.suraj.mm.repository.PriorityRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class PriorityServiceImpl implements PriorityService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private PriorityRepository priorityRepository;

	@Override
	public List<Priority> findAllPriority() {
		logger.info("listAllPriority called");
		List<Priority> priorities = priorityRepository.findAll();
		return priorities.isEmpty() ? null : priorities;
	}

	@Override
	public Priority findPriorityById(Long id) {
		logger.info("getPriorityById called");
		return priorityRepository.findById(id).orElse(null);
	}

	@Override
	public Priority saveOrUpdatePriority(Priority priority) {
		logger.info("savePriority called");
		Priority p = priorityRepository.save(priority);
		return p == null ? null : p;
	}

	@Override
	public Integer deletePriority(Long id) {
		logger.info("deletePriority called");
		priorityRepository.deleteById(id);
		return 0;

	}

}
