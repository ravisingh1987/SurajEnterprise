package com.suraj.mm.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.model.UnitMaster;
import com.suraj.mm.repository.UnitMasterRepository;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the User Entity
 */
@Service
public class UnitMasterServiceImpl implements UnitMasterService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UnitMasterRepository unitMasterRepository;

	@Override
	public Iterable<UnitMaster> listAllUnitMaster() {
		logger.info("listAllUnitMaster called");
		return unitMasterRepository.findAll();
	}

	@Override
	public UnitMaster getUnitMasterById(Long id) {
		logger.info("getUnitMasterById called");
		return unitMasterRepository.findById(id).orElse(null);
	}

	@Override
	public UnitMaster saveUnitMaster(UnitMaster unitMaster) {
		logger.info("saveUnitMaster called");
		return unitMasterRepository.save(unitMaster);
	}

	@Override
	public void deleteUnitMaster(Long id) {
		logger.info("deleteUnitMaster called");
		unitMasterRepository.deleteById(id);

	}

}
