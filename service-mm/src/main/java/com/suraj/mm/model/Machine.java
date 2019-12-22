package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author Dilip Kirar
 *
 */
@Data
@Entity
@Table(name = "machine_master")
public class Machine extends AbstractEntity{

	@Id
	@GeneratedValue(generator="machineInc")
	@GenericGenerator(name="machineInc", strategy = "increment") 
	@Column(name = "machine_id")
	private Long machineId;

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

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getMachineQty() {
		return machineQty;
	}

	public void setMachineQty(String machineQty) {
		this.machineQty = machineQty;
	}

	public String getMachineDesc() {
		return machineDesc;
	}

	public void setMachineDesc(String machineDesc) {
		this.machineDesc = machineDesc;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Machine [machineId=" + machineId + ", machineName=" + machineName + ", machineQty=" + machineQty
				+ ", machineDesc=" + machineDesc + ", isActive=" + isActive + "]";
	}


}
