package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "work_rate_mapping")
public class WorkRateMapping extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "wrkRteInc")
	@GenericGenerator(name = "wrkRteInc", strategy = "increment")
	@Column(name = "work_rate_mapping_id")
	private Long workRateMappingId;

	@Column(name = "work_id")
	private Long workId;

	@Column(name = "rate_id")
	private Long rateId;

	public Long getWorkRateMappingId() {
		return workRateMappingId;
	}

	public void setWorkRateMappingId(Long workRateMappingId) {
		this.workRateMappingId = workRateMappingId;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	public Long getRateId() {
		return rateId;
	}

	public void setRateId(Long rateId) {
		this.rateId = rateId;
	}

	@Override
	public String toString() {
		return "WorkRateMapping [workRateMappingId=" + workRateMappingId + ", workId=" + workId + ", rateId=" + rateId
				+ "]";
	}

}
