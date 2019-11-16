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
@Table(name = "rate")
public class Rate {
	@Id
	@GeneratedValue
	@Column(name = "rate_id")
	private String rateId;

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
}
