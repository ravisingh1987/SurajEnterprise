package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "machinne_rate_mapping")
public class MachineRateMapping extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "mchnRteInc")
	@GenericGenerator(name = "mchnRteInc", strategy = "increment")
	@Column(name = "MachinneRateMapping_id")
	private Long userPaymentMappingId;

	@Column(name = "machine_id")
	private Long machineId;

	@Column(name = "rate_id")
	private Long rateId;

	public Long getUserPaymentMappingId() {
		return userPaymentMappingId;
	}

	public void setUserPaymentMappingId(Long userPaymentMappingId) {
		this.userPaymentMappingId = userPaymentMappingId;
	}

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	@Override
	public String toString() {
		return "MachinneRateMapping [userPaymentMappingId=" + userPaymentMappingId + ", machineId=" + machineId
				+ ", rateId=" + rateId + "]";
	}

}
