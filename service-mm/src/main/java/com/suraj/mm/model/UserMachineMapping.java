package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "user_machine_mapping")
public class UserMachineMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "usrMchnInc")
	@GenericGenerator(name = "usrMchnInc", strategy = "increment")
	@Column(name = "user_machine_mapping_id")
	private Long userMachineMappingId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "machine_id")
	private Long machineId;

	public Long getUserMachineMappingId() {
		return userMachineMappingId;
	}

	public void setUserMachineMappingId(Long userMachineMappingId) {
		this.userMachineMappingId = userMachineMappingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getMachineId() {
		return machineId;
	}

	public void setMachineId(Long machineId) {
		this.machineId = machineId;
	}

	@Override
	public String toString() {
		return "UserMachineMapping [userMachineMappingId=" + userMachineMappingId + ", userId=" + userId
				+ ", machineId=" + machineId + "]";
	}

}
