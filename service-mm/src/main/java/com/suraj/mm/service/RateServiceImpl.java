package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

	@Override
	public Iterable<Rate> listAllRate() {
		logger.info("listAllRate called");
		return rateRepository.findAll();
	}

	@Override
	public Rate getRateById(Long id) {
		logger.info("getRateById called");
		return rateRepository.findById(id).orElse(null);
	}

	@Override
	public Rate saveRate(Rate rate) {
		logger.info("saveRate called");
		return rateRepository.save(rate);
	}

	@Override
	public void deleteRate(Long id) {
		logger.info("deleteRate called");
		rateRepository.deleteById(id);

	}

}
