package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dilip Kirar
 *
 */

@Entity
@Table(name = "machine")
public class Machine {

	@Id
	@GeneratedValue
	@Column(name = "machine_id")
	private Long machineId;

	@Column(name = "user_master_user_id")
	private String userMasterUserId;

	@Column(name = "machine_name")
	private String machineName;

	@Column(name = "machine_qty")
	private String machineQty;

	@Column(name = "machine_desc")
	private String machineDesc;

	/*
	 * created_by updated_by created_date updated_date
	 */
	@Column(name = "is_active")
	private String isActive;
}
