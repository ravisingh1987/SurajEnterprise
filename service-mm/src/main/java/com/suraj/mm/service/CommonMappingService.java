package com.suraj.mm.service;

import java.util.List;

import com.suraj.mm.dto.MachineDTO;
import com.suraj.mm.model.MachineCapacityMapping;
import com.suraj.mm.model.MachinePriorityMapping;
import com.suraj.mm.model.MachineRateMapping;
import com.suraj.mm.model.RateUnitmasterMapping;
import com.suraj.mm.model.UserCapacityMapping;
import com.suraj.mm.model.UserMachineMapping;
import com.suraj.mm.model.UserPaymentMapping;
import com.suraj.mm.model.UserPriorityMapping;
import com.suraj.mm.model.WorkPaymentMapping;
import com.suraj.mm.model.WorkPriorityMapping;
import com.suraj.mm.model.WorkRateMapping;

/**
 * @author Dilip Kirar
 *
 */
public interface CommonMappingService {
	/* Service for user_machine_mapping */
	List<?> findAllUserMachineMapping(Class<?> uMFlag);
	
	List<?> findAllMachineDtoByUserId(Long userId);	
	
	MachineDTO findMachineDtoByMachineId(Long machineId);
	
	List<UserMachineMapping> saveOrUpdateUserMachineMapping(MachineDTO machineDto);

	Integer deleteUserMachineMappingByUserId(Long userId);

	Integer deleteUserMachineMappingByMachineId(Long machineId);

	/* Service for machine_capacity_mapping */
	List<?> findAllMachineCapacityMapping();

	void saveOrUpdateMachineCapacityMapping(MachineCapacityMapping machineCapacityMapping);

	Integer deleteMachineCapacityMappingByMachineId(Long machineId);

	Integer deleteMachineCapacityMappingByCapacityId(Long capacityId);

	/* Service for user_capacity_mapping */
	List<?> findAllUserCapacityMapping();

	void saveOrUpdateUserCapacityMapping(UserCapacityMapping userCapacityMapping);

	Integer deleteUserCapacityMappingByUserId(Long userId);

	Integer deleteUserCapacityMappingByCapacityId(Long capacityId);

	/* Service for machine_priority_mapping */
	List<?> findAllMachinePriorityMapping();

	void saveOrUpdateMachinePriorityMapping(MachinePriorityMapping machinePriorityMapping);

	Integer deleteMachinePriorityMappingByMachineId(Long machineId);

	Integer deleteMachinePriorityMappingByPriorityId(Long priorityId);

	/* Service for work_priority_mapping */
	List<?> findAllWorkPriorityMapping();

	void saveOrUpdateWorkPriorityMapping(WorkPriorityMapping workPriorityMapping);

	Integer deleteWorkPriorityMappingByWorkId(Long worIkd);

	Integer deleteWorkPriorityMappingByPriorityId(Long priorityId);

	/* Service for user_priority_mapping */
	List<?> findAllUserPriorityMapping();

	void saveOrUpdateUserPriorityMapping(UserPriorityMapping userPriorityMapping);

	Integer deleteUserPriorityMappingByUserId(Long userId);

	Integer deleteUserPriorityMappingByPriority(Long priorityId);

	/* Service for user_payment_mapping */
	List<?> findAllUserPaymentMapping();

	void saveOrUpdateUserPaymentMapping(UserPaymentMapping userPaymentMapping);

	Integer deleteUserPaymentMappingByUserId(Long userId);

	Integer deleteUserPaymentMappingByPaymentId(Long paymentId);

	/* Service for work_payment_mapping */
	List<?> findAllWorkPaymentMapping();

	void saveOrUpdateWorkPaymentMapping(WorkPaymentMapping workPaymentMapping);

	Integer deleteWorkPaymentMappingByWorkId(Long workId);

	Integer deleteWorkPaymentMappingByPaymentId(Long paymentId);
	
	/* Service for rate_unitmaster_mapping */
	List<?> findAllRateUnitMapping();

	void saveOrUpdateRateUnitMapping(RateUnitmasterMapping rateUnitMapping);

	Integer deleteRateUnitMappingByRateId(Long RateId);
	
	Integer deleteRateUnitMappingByUnitId(Long unitId);

	/* Service for work_rate_mapping */
	List<?> findAllWorkRateMapping();

	void saveOrUpdateWorkRateMapping(WorkRateMapping workRateMapping);

	Integer deleteWorkRateMappingByWorkId(Long workId);
	
	Integer deleteWorkRateMappingByRateId(Long id);

	/* Service for machinne_rate_mapping */
	List<?> findAllMachineRateMapping();

	void saveOrUpdateMachineRateMapping(MachineRateMapping MachineRateMapping);

	Integer deleteMachineRateMappingByMachineId(Long machineId);
	
	Integer deleteMachineRateMappingByRateId(Long rateId);

}
