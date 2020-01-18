package com.suraj.mm.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suraj.mm.dto.MachineDTO;
import com.suraj.mm.mapper.MachineMapper;
import com.suraj.mm.model.Machine;
import com.suraj.mm.model.MachineCapacityMapping;
import com.suraj.mm.model.MachinePriorityMapping;
import com.suraj.mm.model.MachineRateMapping;
import com.suraj.mm.model.RateUnitmasterMapping;
import com.suraj.mm.model.User;
import com.suraj.mm.model.UserCapacityMapping;
import com.suraj.mm.model.UserMachineMapping;
import com.suraj.mm.model.UserPaymentMapping;
import com.suraj.mm.model.UserPriorityMapping;
import com.suraj.mm.model.WorkPaymentMapping;
import com.suraj.mm.model.WorkPriorityMapping;
import com.suraj.mm.model.WorkRateMapping;
import com.suraj.mm.repository.MachineCapacityMappingRepository;
import com.suraj.mm.repository.MachinePriorityMappingRepository;
import com.suraj.mm.repository.MachinneRateMappingRepository;
import com.suraj.mm.repository.RateUnitmasterMappingRepository;
import com.suraj.mm.repository.UserCapacityMappingRepository;
import com.suraj.mm.repository.UserMachineMappingRepository;
import com.suraj.mm.repository.UserPaymentMappingRepository;
import com.suraj.mm.repository.UserPriorityMappingRepository;
import com.suraj.mm.repository.WorkPaymentMappingRepository;
import com.suraj.mm.repository.WorkPriorityMappingRepository;
import com.suraj.mm.repository.WorkRateMappingRepository;
import com.suraj.mm.util.CommonUtil;

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
	@Autowired
	private MachineMapper machineMapper;
	@Autowired
	private CommonUtil commonUtil;

	/**
	 * In this function to create Hibernate session in persistence class Session
	 * hSession = entityManager.unwrap(Session.class);
	 */
	@Override
	public List<?> findAllUserMachineMapping(Class<?> uMFlag) {
		Session hSession = entityManager.unwrap(Session.class);
		try {
			if (uMFlag.equals(User.class)) {
				String sql = "SELECT u.user_id AS userId ,u.first_name AS firstName "
						+ "FROM  user_master u , machine_master m ,user_machine_mapping um "
						+ "WHERE u.user_id= um.user_id AND m.machine_id= um.machine_id AND m.is_active = 'Yes' ";
				Query query = hSession.createSQLQuery(sql).addScalar("userId", StandardBasicTypes.LONG)
						.addScalar("firstName", StandardBasicTypes.STRING);

				List<User> listUser = query.setResultTransformer(Transformers.aliasToBean(User.class)).list();
				return listUser;
			} else {
				String sql = "SELECT m.machine_id AS machineId ,m.machine_name AS machineName, m.machine_qty AS machineQty,m.machine_desc AS machineDesc "
						+ " FROM  user_master u , machine_master m ,user_machine_mapping um "
						+ " WHERE u.user_id= um.user_id AND m.machine_id= um.machine_id AND m.is_active = 'Yes' ";
				Query query = hSession.createSQLQuery(sql).addScalar("machineId", StandardBasicTypes.LONG)
						.addScalar("machineName", StandardBasicTypes.STRING)
						.addScalar("machineQty", StandardBasicTypes.INTEGER)
						.addScalar("machineDesc", StandardBasicTypes.STRING);

				List<Machine> listMachine = query.setResultTransformer(Transformers.aliasToBean(Machine.class)).list();
				return listMachine;
			}
		} finally {
			if (hSession.isOpen()) {
				hSession.close();
			}
		}

	}

	@Override
	public List<?> findAllMachineDtoByUserId(Long userId) {

		return null;
	}

	@Override
	public MachineDTO findMachineDtoByMachineId(Long machineId) {
		Session hSession = entityManager.unwrap(Session.class);

		String sql = "SELECT u.user_id AS userID,concat(u.first_name,\" \", u.last_name) as name,m.machine_id AS machineId ,cm.capacity_id AS capacityId,cm.capacity_value AS capacityValue, "
				+ "cm.capacity_desc AS capacityDesc,m.machine_name AS machineName, m.is_active AS machineStatus, m.machine_qty AS machineQty, m.machine_desc AS machineDesc "
				+ "FROM  user_master u , machine_master m ,user_machine_mapping um ,capacity_master cm ,machine_capacity_mapping mcp ,user_capacity_mapping ucp "
				+ "WHERE u.user_id= um.user_id AND m.machine_id= um.machine_id AND m.machine_id = mcp.machine_id AND mcp.capacity_id= cm.capacity_id AND m.is_active = 'Yes' AND m.machine_id ="
				+ machineId;
		try {
			List<Object[]> objectList = hSession.createSQLQuery(sql).list();
			return commonUtil.prepareMachineDto(objectList);
		} finally {
			if (hSession.isOpen()) {
				hSession.close();
			}
		}

	}

	@Override
	public List<UserMachineMapping> saveOrUpdateUserMachineMapping(MachineDTO machineDto) {
		List<UserMachineMapping> userMachineMapping = MachineMapper.mapListFromMachineDto(machineDto);
		List<UserMachineMapping> ump = userMachineMappingRepository.saveAll(userMachineMapping);
		return ump == null ? null : ump;

	}

	@Override
	public Integer deleteUserMachineMappingByUserId(Long userId) {
		userMachineMappingRepository.deleteById(userId);
		return null;
	}

	@Override
	public Integer deleteUserMachineMappingByMachineId(Long machineId) {
		userMachineMappingRepository.deleteById(machineId);
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
