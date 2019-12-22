package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "user_capacity_mapping")
public class UserCapacityMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "usrMchnInc")
	@GenericGenerator(name = "usrCptInc", strategy = "increment")
	@Column(name = "user_capacity_mapping_id")
	private Long userCapacityMappingId;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "capacity_id")
	private Long capacityId;

	public Long getUserCapacityMappingId() {
		return userCapacityMappingId;
	}

	public void setUserCapacityMappingId(Long userCapacityMappingId) {
		this.userCapacityMappingId = userCapacityMappingId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getCapacityId() {
		return capacityId;
	}

	public void setCapacityId(Long capacityId) {
		this.capacityId = capacityId;
	}

	@Override
	public String toString() {
		return "UserCapacityMapping [userCapacityMappingId=" + userCapacityMappingId + ", userId=" + userId
				+ ", capacityId=" + capacityId + "]";
	}

}
