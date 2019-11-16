package com.suraj.mm.model;

/**
 * @author Dilip Kirar 2019
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "capacity")
public class Capacity {

	@Id
	@GeneratedValue
	@Column(name = "capacity_id")
	private String capacityId;

	@Column(name = "user_master_user_id")
	private String user_master_user_id;

	@Column(name = "machine_id")
	private String machine_id;

	@Column(name = "capacity_value")
	private String capacity_value;

	@Column(name = "capacity_desc")
	private String capacity_desc;

	@Column(name = "capacity_flag")
	private String capacity_flag;

	/*
	 * created_by updated_by created_date updated_date
	 */
}
