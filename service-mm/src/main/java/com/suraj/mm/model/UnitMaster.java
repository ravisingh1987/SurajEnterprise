package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Dilip Kirar 2019
 *
 */

@Entity
@Table(name = "unit_master")
public class UnitMaster extends AbstractEntity{
	@Id
	@GeneratedValue(generator="UnitMasterInc")
	@GenericGenerator(name="UnitMasterInc", strategy = "increment") 
	@Column(name = "unit_id")
	private Long unitId;

	@Column(name = "unit_name")
	private String unitName;

	@Column(name = "unit_desc")
	private String unitDesc;
	/* created_by updated_by created_date updated_date */

	@Column(name = "is_active")
	private String isActive;

	public Long getUnitId() {
		return unitId;
	}

	public void setUnitId(Long unitId) {
		this.unitId = unitId;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public String getUnitDesc() {
		return unitDesc;
	}

	public void setUnitDesc(String unitDesc) {
		this.unitDesc = unitDesc;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "UnitMaster [unitId=" + unitId + ", unitName=" + unitName + ", unitDesc=" + unitDesc + ", isActive="
				+ isActive + "]";
	}

}
