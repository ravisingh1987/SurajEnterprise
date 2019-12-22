package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author Dilip Kirar 2019
 *
 */
@Data
@Entity
@Table(name = "rate_master")
public class Rate extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "rateInc")
	@GenericGenerator(name = "rateInc", strategy = "increment")
	@Column(name = "rate_id")
	private Long rateId;

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
		return "Rate [rateId=" + rateId + ", rateValue=" + rateValue + ", rateDesc=" + rateDesc + ", rateUnitId="
				+ rateUnitId + ", isActive=" + isActive + "]";
	}

}
