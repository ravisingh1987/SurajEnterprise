package com.suraj.mm.service;

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
	public Iterable<Priority> listAllPriority() {
		logger.info("listAllPriority called");
		return priorityRepository.findAll();
	}

	@Override
	public Priority getPriorityById(Long id) {
		logger.info("getPriorityById called");
		return priorityRepository.findById(id).orElse(null);
	}

	@Override
	public Priority savePriority(Priority priority) {
		logger.info("savePriority called");
		return priorityRepository.save(priority);
	}

	@Override
	public void deletePriority(Long id) {
		logger.info("deletePriority called");
		priorityRepository.deleteById(id);

	}

}
