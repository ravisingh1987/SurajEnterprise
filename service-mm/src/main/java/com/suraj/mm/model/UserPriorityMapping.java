package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "user_priority_mapping")
public class UserPriorityMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "usrPrtyInc")
	@GenericGenerator(name = "usrPrtyInc", strategy = "increment")
	@Column(name = "user_priority_mapping_id")
	private Long userPriorityMappingId;

	@Column(name = "priority_id")
	private Long priorityId;

	@Column(name = "user_id")
	private Long userId;

	public Long getUserPriorityMappingId() {
		return userPriorityMappingId;
	}

	public void setUserPriorityMappingId(Long userPriorityMappingId) {
		this.userPriorityMappingId = userPriorityMappingId;
	}

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserPriorityMapping [userPriorityMappingId=" + userPriorityMappingId + ", priorityId=" + priorityId
				+ ", userId=" + userId + "]";
	}

}
