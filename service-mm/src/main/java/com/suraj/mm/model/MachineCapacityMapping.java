package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "machine_capacity_mapping")
public class MachineCapacityMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "mchnCaptInc")
	@GenericGenerator(name = "mchnCaptInc", strategy = "increment")
	@Column(name = "machine_capacity_mapping_id")
	private Long machineCapacityMappingId;

	@Column(name = "capacity_id")
	private Long capacityId;

	@Column(name = "machine_id")
	private Long machineId;

	public Long getMachineCapacityMappingId() {
		return machineCapacityMappingId;
	}

	public void setMachineCapacityMappingId(Long machineCapacityMappingId) {
		this.machineCapacityMappingId = machineCapacityMappingId;
	}

	public Long getCapacityId() {
		return capacityId;
	}

	public void setCapacityId(Long capacityId) {
		this.capacityId = capacityId;
	}

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	@Override
	public String toString() {
		return "MachineCapacityMapping [machineCapacityMappingId=" + machineCapacityMappingId + ", capacityId="
				+ capacityId + ", machineId=" + machineId + "]";
	}

}
