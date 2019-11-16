package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dilip Kirar 2019
 *
 */

@Entity
@Table(name = "payment")
public class Payment {
	@Id
	@GeneratedValue
	@Column(name = "paymentId")
	private String payment_id;

	@Column(name = "work_id")
	private String workId;

	@Column(name = "user_master_user_id")
	private String userMasterUserId;

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
}
