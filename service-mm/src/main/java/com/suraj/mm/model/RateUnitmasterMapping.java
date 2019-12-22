package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "rate_unitmaster_mapping")
public class RateUnitmasterMapping extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "rteUnitInc")
	@GenericGenerator(name = "rteUnitInc", strategy = "increment")
	@Column(name = "rate_unitmaster_mapping_id")
	private Long rateUnitMappingId;

	@Column(name = "rate_id")
	private Long rateId;

	@Column(name = "unit_id")
	private Long unitId;

	public Long getRateUnitMappingId() {
		return rateUnitMappingId;
	}

	public void setRateUnitMappingId(Long rateUnitMappingId) {
		this.rateUnitMappingId = rateUnitMappingId;
	}

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	@Override
	public String toString() {
		return "RateUnitmasterMapping [rateUnitMappingId=" + rateUnitMappingId + ", rateId=" + rateId + ", unitId="
				+ unitId + "]";
	}
	
}
