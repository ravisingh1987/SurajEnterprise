package com.suraj.mm.service;

import com.suraj.mm.model.UnitMaster;

/**
 * @author Dilip Kirar
 *
 */
public interface UnitMasterService {

	Iterable<UnitMaster> listAllUnitMaster();

	UnitMaster getUnitMasterById(Long id);

	UnitMaster saveUnitMaster(UnitMaster unitMaster);

	void deleteUnitMaster(Long id);
}
