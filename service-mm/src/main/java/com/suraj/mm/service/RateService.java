package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Rate;

/**
 * @author Dilip Kirar
 *
 */
public interface RateService {

	List<Rate> findAllRate();

	Rate findRateById(Long id);

	Rate saveOrUpdateRate(Rate rate);

	Integer deleteRate(Long id);

}
