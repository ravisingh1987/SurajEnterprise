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
@Table(name = "unit_master")
public class UnitMaster {
	@Id
	@GeneratedValue
	@Column(name = "unit_id")
	private String unitId;
	
	@Column(name = "unit_name")
	private String unitName;
	
	@Column(name = "unit_desc")
	private String unitDesc;
	/* created_by updated_by created_date updated_date */
	
	@Column(name = "is_active")
	private String isActive;
}
