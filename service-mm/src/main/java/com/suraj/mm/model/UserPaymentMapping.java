package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "user_payment_mapping")
public class UserPaymentMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "usrPmntInc")
	@GenericGenerator(name = "usrPmntInc", strategy = "increment")
	@Column(name = "user_payment_mapping_id")
	private Long userPaymentMappingId;

	@Column(name = "payment_id")
	private Long paymentId;

	@Column(name = "user_id")
	private Long userId;

	public Long getUserPaymentMappingId() {
		return userPaymentMappingId;
	}

	public void setUserPaymentMappingId(Long userPaymentMappingId) {
		this.userPaymentMappingId = userPaymentMappingId;
	}

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserPaymentMapping [userPaymentMappingId=" + userPaymentMappingId + ", paymentId=" + paymentId
				+ ", userId=" + userId + "]";
	}

}
