package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "work_payment_mapping")
public class WorkPaymentMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "wrkPmntInc")
	@GenericGenerator(name = "wrkPmntInc", strategy = "increment")
	@Column(name = "work_payment_mapping_id")
	private Long workPaymentMappingId;

	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "work_id")
	private Long workId;

	public Long getWorkPaymentMappingId() {
		return workPaymentMappingId;
	}

	public void setWorkPaymentMappingId(Long workPaymentMappingId) {
		this.workPaymentMappingId = workPaymentMappingId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	@Override
	public String toString() {
		return "WorkPaymentMapping [workPaymentMappingId=" + workPaymentMappingId + ", paymentId=" + paymentId
				+ ", workId=" + workId + "]";
	}

}
