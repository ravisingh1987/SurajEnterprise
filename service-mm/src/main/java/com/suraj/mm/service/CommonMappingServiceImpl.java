package com.suraj.mm.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suraj.mm.model.*;
import com.suraj.mm.repository.*;

/**
 * @author Dilip Kirar
 * @version 1.0 Service method for the manipulating the CommonMapping
 */
@Service
public class CommonMappingServiceImpl implements CommonMappingService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private EntityManager entityManager;
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
	private WorkPaymentMappingRepository workPaymentMappingRepository;
	@Autowired
	private WorkPriorityMappingRepository workPriorityMappingRepository;
	@Autowired
	private WorkRateMappingRepository workRateMappingRepository;

	/**
	 * In this function to create Hibernate session in persistence class Session
	 * hSession = entityManager.unwrap(Session.class);
	 */
	@Override
	public List<?> findAllUserMachineMapping() {
		Session hSession = entityManager.unwrap(Session.class);
		try {
			String sql = "select * from User u ,Machine m ,UserMachineMapping um where um.userId= u.userId and um.machineId= m.machineId";
			Query query = hSession.createQuery(sql);
			List<Object[]> listObj = query.list();
			return listObj;
		} finally {
			if (hSession.isOpen()) {
				hSession.close();
			}
		}

	}

	@Override
	public void saveOrUpdateUserMachineMapping(UserMachineMapping userMachineMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserMachineMappingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUserMachineMappingByMachineId(Long machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachineCapacityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachineCapacityMapping(MachineCapacityMapping machineCapacityMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachineCapacityMappingByMachineId(Long machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMachineCapacityMappingByCapacityId(Long capacityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserCapacityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserCapacityMapping(UserCapacityMapping userCapacityMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserCapacityMappingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUserCapacityMappingByCapacityId(Long capacityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachinePriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachinePriorityMapping(MachinePriorityMapping machinePriorityMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachinePriorityMappingByMachineId(Long machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMachinePriorityMappingByPriorityId(Long priorityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkPriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkPriorityMapping(WorkPriorityMapping workPriorityMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkPriorityMappingByWorkId(Long worIkd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteWorkPriorityMappingByPriorityId(Long priorityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserPriorityMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserPriorityMapping(UserPriorityMapping userPriorityMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserPriorityMappingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUserPriorityMappingByPriority(Long priorityId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllUserPaymentMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateUserPaymentMapping(UserPaymentMapping userPaymentMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteUserPaymentMappingByUserId(Long userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteUserPaymentMappingByPaymentId(Long paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkPaymentMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkPaymentMapping(WorkPaymentMapping workPaymentMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkPaymentMappingByWorkId(Long workId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteWorkPaymentMappingByPaymentId(Long paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllRateUnitMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateRateUnitMapping(RateUnitmasterMapping rateUnitMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteRateUnitMappingByRateId(Long RateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteRateUnitMappingByUnitId(Long unitId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllWorkRateMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateWorkRateMapping(WorkRateMapping workRateMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteWorkRateMappingByWorkId(Long workId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteWorkRateMappingByRateId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> findAllMachineRateMapping() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdateMachineRateMapping(MachineRateMapping MachineRateMapping) {
		// TODO Auto-generated method stub

	}

	@Override
	public Integer deleteMachineRateMappingByMachineId(Long machineId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteMachineRateMappingByRateId(Long rateId) {
		// TODO Auto-generated method stub
		return null;
	}

}
