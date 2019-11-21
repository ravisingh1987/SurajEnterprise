package com.suraj.mm.service;

import com.suraj.mm.model.Rate;

/**
 * @author Dilip Kirar
 *
 */
public interface RateService {

	Iterable<Rate> listAllRate();

	Rate getRateById(Long id);

	Rate saveRate(Rate rate);

	void deleteRate(Long id);
}
