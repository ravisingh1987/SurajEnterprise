package com.suraj.mm.dto;

public class LabourDTO {
	private String labourId;
	private String capacityId;
	private String capacityValue;
	private String labourName;

	/**
	 * 
	 */
	public LabourDTO() {

	}

	/**
	 * @param labourId
	 * @param capacityId
	 * @param capacityValue
	 * @param labourName
	 */
	public LabourDTO(String labourId, String capacityId, String capacityValue, String labourName) {
		super();
		this.labourId = labourId;
		this.capacityId = capacityId;
		this.capacityValue = capacityValue;
		this.labourName = labourName;
	}

	public String getLabourId() {
		return labourId;
	}

	public void setLabourId(String labourId) {
		this.labourId = labourId;
	}

	public String getCapacityId() {
		return capacityId;
	}

	public void setCapacityId(String capacityId) {
		this.capacityId = capacityId;
	}

	public String getCapacityValue() {
		return capacityValue;
	}

	public void setCapacityValue(String capacityValue) {
		this.capacityValue = capacityValue;
	}

	public String getLabourName() {
		return labourName;
	}

	public void setLabourName(String labourName) {
		this.labourName = labourName;
	}

}
