package com.suraj.mm.dto;

import java.util.List;

public class MachineDTO {

	private String machineType;
	private String machineId;
	private String machineStatus;
	private String quantity;
	private String createdBy;
	private String createdDate;
	private List<LabourDTO> labours;

	public String getMachineType() {
		return machineType;
	}

	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getMachineStatus() {
		return machineStatus;
	}

	public void setMachineStatus(String machineStatus) {
		this.machineStatus = machineStatus;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public List<LabourDTO> getLabours() {
		return labours;
	}

	public void setLabours(List<LabourDTO> labours) {
		this.labours = labours;
	}

}
