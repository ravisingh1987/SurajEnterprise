package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.Work;

/**
 * @author Dilip Kirar
 *
 */
public interface WorkService {

	List<Work> findAllWorks();

	Work findWorkById(Long id);

	Work saveOrUpdateWork(Work work);

	Integer deleteWork(Long id);

}
