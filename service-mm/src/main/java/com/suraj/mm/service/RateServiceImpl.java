package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.mm.model.Capacity;
import com.suraj.mm.model.Rate;
import com.suraj.mm.repository.RateRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class RateServiceImpl implements RateService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private RateRepository rateRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Rate> findAllRate() {
		logger.info("listAllRate called");
		List<Rate> rate = rateRepository.findAll();
		return rate.isEmpty() ? null : rate;

	}

	@Transactional(readOnly = true)
	@Override
	public Rate findRateById(Long id) {
		logger.info("getRateById called");
		return rateRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public Rate saveOrUpdateRate(Rate rate) {
		logger.info("saveOrUpdateRate called");
		Rate r = rateRepository.save(rate);
		return r == null ? null : r;
	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteRate(Long id) {
		logger.info("deleteRate called");
		Rate rate = findRateById(id);
		rate.setIsActive("0");
		saveOrUpdateRate(rate);
		return 0;

	}

}
