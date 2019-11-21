package com.suraj.mm.service;

import com.suraj.mm.model.Priority;

/**
 * @author Dilip Kirar
 *
 */
public interface PriorityService {

	Iterable<Priority> listAllPriority();

	Priority getPriorityById(Long id);

	Priority savePriority(Priority priority);

	void deletePriority(Long id);
}
