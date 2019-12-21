package com.suraj.mm.service;

import java.util.List;

/**
 * @author Dilip Kirar
 *
 */
public interface CommonMappingService {
	/* Service for user_machine_mapping */
	List<?> findAllUserMachineMapping();

	void saveOrUpdateUserMachineMapping();

	Integer deleteUserMachineMapping(Long id);

	/* Service for machine_capacity_mapping */
	List<?> findAllMachineCapacityMapping();

	void saveOrUpdateMachineCapacityMapping();

	Integer deleteMachineCapacityMapping(Long id);

	/* Service for user_work_mapping */
	List<?> findAllUserWorkMapping();

	void saveOrUpdateUserWorkMapping();

	Integer deleteUserWorkMapping(Long id);

	/* Service for user_capacity_mapping */
	List<?> findAllUserCapacityMapping();

	void saveOrUpdateUserCapacityMapping();

	Integer deleteUserCapacityMapping(Long id);

	/* Service for machine_priority_mapping */
	List<?> findAllMachinePriorityMapping();

	void saveOrUpdateMachinePriorityMapping();

	Integer deleteMachinePriorityMapping(Long id);

	/* Service for work_priority_mapping */
	List<?> findAllWorkPriorityMapping();

	void saveOrUpdateWorkPriorityMapping();

	Integer deleteWorkPriorityMapping(Long id);

	/* Service for user_priority_mapping */
	List<?> findAllUserPriorityMapping();

	void saveOrUpdateUserPriorityMapping();

	Integer deleteUserPriorityMapping(Long id);

	/* Service for user_payment_mapping */
	List<?> findAllUserPaymentMapping();

	void saveOrUpdateUserPaymentMapping();

	Integer deleteUserPaymentMapping(Long id);

	/* Service for work_payment_mapping */
	List<?> findAllWorkPaymentMapping();

	void saveOrUpdateWorkPaymentMapping();

	Integer deleteWorkPaymentMapping(Long id);

	/* Service for rate_unitmaster_mapping */
	List<?> findAllRateUnitMapping();

	void saveOrUpdateRateUnitMapping();

	Integer deleteRateUnitMapping(Long id);

	/* Service for work_rate_mapping */
	List<?> findAllWorkRateMapping();

	void saveOrUpdateWorkRateMapping();

	Integer deleteWorkRateMapping(Long id);

	/* Service for machinne_rate_mapping */
	List<?> findAllMachineRateMapping();

	void saveOrUpdateMachineRateMapping();

	Integer deleteMachineRateMapping(Long id);

}
