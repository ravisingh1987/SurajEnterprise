package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Dilip Kirar 2019
 *
 */
@Data
@Entity
@Table(name = "rate")
public class Rate {
	@Id
	@GeneratedValue
	@Column(name = "rate_id")
	private Long rateId;

	@Column(name = "unit_master_unit_id")
	private String unitMasterUnitId;

	@Column(name = "work_id")
	private String workId;

	@Column(name = "machine_id")
	private String machineId;

	@Column(name = "rate_value")
	private String rateValue;

	@Column(name = "rate_desc")
	private String rateDesc;

	@Column(name = "rate_unit_id")
	private String rateUnitId;
	/* created_by updated_by created_date updated_date */

	@Column(name = "is_active")
	private String isActive;

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	public String getUnitMasterUnitId() {
		return unitMasterUnitId;
	}

	public void setUnitMasterUnitId(String unitMasterUnitId) {
		this.unitMasterUnitId = unitMasterUnitId;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getRateValue() {
		return rateValue;
	}

	public void setRateValue(String rateValue) {
		this.rateValue = rateValue;
	}

	public String getRateDesc() {
		return rateDesc;
	}

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}

	public String getRateUnitId() {
		return rateUnitId;
	}

	public void setRateUnitId(String rateUnitId) {
		this.rateUnitId = rateUnitId;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Rate [rateId=" + rateId + ", unitMasterUnitId=" + unitMasterUnitId + ", workId=" + workId
				+ ", machineId=" + machineId + ", rateValue=" + rateValue + ", rateDesc=" + rateDesc + ", rateUnitId="
				+ rateUnitId + ", isActive=" + isActive + "]";
	}

}
