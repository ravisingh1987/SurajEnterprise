package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "machine_priority_mapping")
public class MachinePriorityMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "mchnPrtyInc")
	@GenericGenerator(name = "mchnPrtyInc", strategy = "increment")
	@Column(name = "machine_priority_mapping_id")
	private Long machinePriorityMappingId;

	@Column(name = "priority_id")
	private Long priorityId;

	@Column(name = "machine_id")
	private Long machineId;

	public Long getMachinePriorityMappingId() {
		return machinePriorityMappingId;
	}

	public void setMachinePriorityMappingId(Long machinePriorityMappingId) {
		this.machinePriorityMappingId = machinePriorityMappingId;
	}

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	@Override
	public String toString() {
		return "MachinePriorityMapping [machinePriorityMappingId=" + machinePriorityMappingId + ", priorityId="
				+ priorityId + ", machineId=" + machineId + "]";
	}

}
