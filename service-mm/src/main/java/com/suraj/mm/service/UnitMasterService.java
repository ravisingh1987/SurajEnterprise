package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.model.UnitMaster;

/**
 * @author Dilip Kirar
 *
 */
public interface UnitMasterService {

	List<UnitMaster> findAllUnitMaster();

	UnitMaster findUnitMasterById(Long id);

	UnitMaster saveOrUpdateUnitMaster(UnitMaster unitMaster);

	Integer deleteUnitMaster(Long id);
}
