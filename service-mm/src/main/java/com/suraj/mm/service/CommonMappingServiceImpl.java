package com.suraj.mm.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.repository.*;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the CommonMapping
 */
@Service
public class CommonMappingServiceImpl implements CommonMappingService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private MachineCapacityMappingRepository machineCapacityMappingRepository;
	@Autowired
	private MachinePriorityMappingRepository machinePriorityMappingRepository;
	@Autowired
	private MachinneRateMappingRepository machinneRateMappingRepository;
	@Autowired
	private RateUnitmasterMappingRepository rateUnitmasterMappingRepository;
	@Autowired
	private UserCapacityMappingRepository userCapacityMappingRepository;
	@Autowired
	private UserMachineMappingRepository userMachineMappingRepository;
	@Autowired
	private UserPaymentMappingRepository userPaymentMappingRepository;
	@Autowired
	private UserPriorityMappingRepository userPriorityMappingRepository;
	@Autowired
	private UserWorkMappingRepository userWorkMappingRepository;
	@Autowired
	private WorkPaymentMappingRepository workPaymentMappingRepository;
	@Autowired
	private WorkPriorityMappingRepository workPriorityMappingRepository;
	@Autowired
	private WorkRateMappingRepository workRateMappingRepository;

	
	@Override
	public List<?> findAllUserMachineMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserMachineMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserMachineMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachineCapacityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachineCapacityMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachineCapacityMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserWorkMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserWorkMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserWorkMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserCapacityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserCapacityMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserCapacityMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachinePriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachinePriorityMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachinePriorityMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkPriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkPriorityMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkPriorityMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserPriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserPriorityMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserPriorityMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserPaymentMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserPaymentMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserPaymentMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkPaymentMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkPaymentMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkPaymentMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllRateUnitMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateRateUnitMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteRateUnitMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkRateMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkRateMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkRateMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachineRateMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachineRateMapping() {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachineRateMapping(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
