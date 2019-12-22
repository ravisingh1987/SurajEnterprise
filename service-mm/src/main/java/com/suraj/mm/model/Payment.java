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
@Table(name = "payment_master")
public class Payment extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "paymentInc")
	@GenericGenerator(name = "paymentInc", strategy = "increment")
	@Column(name = "paymentId")
	private Long payment_id;

	@Column(name = "payment_value")
	private String paymentValue;

	@Column(name = "payment_desc")
	private String paymentDesc;

	@Column(name = "paid")
	private String paid;

	@Column(name = "unpaid")
	private String unPaid;

	@Column(name = "total")
	private String total;
	/* created_by updated_by created_date updated_date */

	@Column(name = "payment_flag")
	private String paymentFlag;

	public Long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(Long payment_id) {
		this.payment_id = payment_id;
	}

	public String getPaymentValue() {
		return paymentValue;
	}

	public void setPaymentValue(String paymentValue) {
		this.paymentValue = paymentValue;
	}

	public String getPaymentDesc() {
		return paymentDesc;
	}

	public void setPaymentDesc(String paymentDesc) {
		this.paymentDesc = paymentDesc;
	}

	public String getPaid() {
		return paid;
	}

	public void setPaid(String paid) {
		this.paid = paid;
	}

	public String getUnPaid() {
		return unPaid;
	}

	public void setUnPaid(String unPaid) {
		this.unPaid = unPaid;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getPaymentFlag() {
		return paymentFlag;
	}

	public void setPaymentFlag(String paymentFlag) {
		this.paymentFlag = paymentFlag;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", paymentValue=" + paymentValue + ", paymentDesc=" + paymentDesc
				+ ", paid=" + paid + ", unPaid=" + unPaid + ", total=" + total + ", paymentFlag=" + paymentFlag + "]";
	}

}
