package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.suraj.mm.model.UnitMaster;
import com.suraj.mm.model.User;
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

	@Transactional(readOnly = true)
	@Override
	public List<UnitMaster> findAllUnitMaster() {
		logger.info("listAllUnitMaster called");
		List<UnitMaster> unitMasters = unitMasterRepository.findAll();
		return unitMasters.isEmpty() ? null : unitMasters;
	}

	@Transactional(readOnly = true)
	@Override
	public UnitMaster findUnitMasterById(Long id) {
		logger.info("getUnitMasterById called");
		return unitMasterRepository.findById(id).orElse(null);
	}

	@Transactional(readOnly = false)
	@Override
	public UnitMaster saveOrUpdateUnitMaster(UnitMaster unitMaster) {
		logger.info("saveUnitMaster called");
		UnitMaster un = unitMasterRepository.save(unitMaster);
		return un == null ? null : un;
	}

	@Transactional(readOnly = false)
	@Override
	public Integer deleteUnitMaster(Long id) {
		logger.info("deleteUnitMaster called");
		UnitMaster un = findUnitMasterById(id);
		un.setIsActive("0");
		saveOrUpdateUnitMaster(un);
		return 0;

	}

}
