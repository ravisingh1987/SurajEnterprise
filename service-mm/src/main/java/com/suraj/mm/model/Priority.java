package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author Dilip Kirar 2019
 *
 */
@Data
@Entity
@Table(name = "priority")
public class Priority {
	@Id
	@GeneratedValue
	@Column(name = "priority_id")
	private Long priorityId;

	@Column(name = "user_master_user_id")
	private String userMasterUserId;

	@Column(name = "work_id")
	private String workId;

	@Column(name = "machine_id")
	private String machineId;

	@Column(name = "priority_all")
	private String priorityAll;

	@Column(name = "non_prioritized")
	private String nonPrioritized;

	@Column(name = "prioritized")
	private String prioritized;

	@Column(name = "priority_desc")
	private String priorityDesc;
	/* created_by updated_by created_date updated_date */

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public String getUserMasterUserId() {
		return userMasterUserId;
	}

	public void setUserMasterUserId(String userMasterUserId) {
		this.userMasterUserId = userMasterUserId;
	}

	public String getWorkId() {
		return workId;
	}

	public void setWorkId(String workId) {
		this.workId = workId;
	}

	public String getMachineId() {
		return machineId;
	}

	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}

	public String getPriorityAll() {
		return priorityAll;
	}

	public void setPriorityAll(String priorityAll) {
		this.priorityAll = priorityAll;
	}

	public String getNonPrioritized() {
		return nonPrioritized;
	}

	public void setNonPrioritized(String nonPrioritized) {
		this.nonPrioritized = nonPrioritized;
	}

	public String getPrioritized() {
		return prioritized;
	}

	public void setPrioritized(String prioritized) {
		this.prioritized = prioritized;
	}

	public String getPriorityDesc() {
		return priorityDesc;
	}

	public void setPriorityDesc(String priorityDesc) {
		this.priorityDesc = priorityDesc;
	}

	@Override
	public String toString() {
		return "Priority [priorityId=" + priorityId + ", userMasterUserId=" + userMasterUserId + ", workId=" + workId
				+ ", machineId=" + machineId + ", priorityAll=" + priorityAll + ", nonPrioritized=" + nonPrioritized
				+ ", prioritized=" + prioritized + ", priorityDesc=" + priorityDesc + "]";
	}

}
