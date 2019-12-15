package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional(readOnly = true)
	@Override
	public List<Work> findAllWorks() {
		logger.info("listAllWorks called");
		List<Work> works = workRepository.findAll();

		return works.isEmpty() ? null : works;
	}

	@Transactional(readOnly = true)
	@Override
	public Work findWorkById(Long id) {
		logger.info("getWorkById called");
		return workRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public Work saveOrUpdateWork(Work work) {
		logger.info("saveWork called");
		Work w = workRepository.save(work);
		return w == null ? null : w;

	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteWork(Long id) {
		logger.info("deleteWork called");
		Work w = findWorkById(id);
		w.setWorkFlag("0");
		saveOrUpdateWork(w);
		return 0;
	}

}
