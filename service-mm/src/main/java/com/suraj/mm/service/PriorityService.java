package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Priority;

/**
 * @author Dilip Kirar
 *
 */
public interface PriorityService {

	List<Priority> findAllPriority();

	Priority findPriorityById(Long id);

	Priority saveOrUpdatePriority(Priority priority);

	Integer deletePriority(Long id);
}
