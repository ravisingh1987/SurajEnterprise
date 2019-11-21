package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.Work;
import com.suraj.mm.repository.WorkRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class WorkServiceImpl implements WorkService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private WorkRepository workRepository;

	@Override
	public Iterable<Work> listAllWorks() {
		logger.info("listAllWorks called");
		return workRepository.findAll();
	}

	@Override
	public Work getWorkById(Long id) {
		logger.info("getWorkById called");
		return workRepository.findById(id).orElse(null);
	}

	@Override
	public Work saveWork(Work work) {
		logger.info("saveWork called");
		return workRepository.save(work);
	}

	@Override
	public void deleteWork(Long id) {
		logger.info("deleteWork called");
		workRepository.deleteById(id);

	}

}
