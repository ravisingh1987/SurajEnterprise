package com.suraj.mm.service;

import com.suraj.mm.model.Work;

/**
 * @author Dilip Kirar
 *
 */
public interface WorkService {

	Iterable<Work> listAllWorks();

	Work getWorkById(Long id);

	Work saveWork(Work work);

	void deleteWork(Long id);
}
