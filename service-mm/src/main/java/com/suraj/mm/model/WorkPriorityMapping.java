package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity(name = "work_priority_mapping")
public class WorkPriorityMapping extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "mchnPrtyInc")
	@GenericGenerator(name = "mchnPrtyInc", strategy = "increment")
	@Column(name = "work_priority_mapping_id")
	private Long workPriorityMappingId;

	@Column(name = "priority_id")
	private Long priorityId;

	@Column(name = "work_id")
	private Long workId;

	public Long getWorkPriorityMappingId() {
		return workPriorityMappingId;
	}

	public void setWorkPriorityMappingId(Long workPriorityMappingId) {
		this.workPriorityMappingId = workPriorityMappingId;
	}

	public Long getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(Long priorityId) {
		this.priorityId = priorityId;
	}

	public Long getWorkId() {
		return workId;
	}

	public void setWorkId(Long workId) {
		this.workId = workId;
	}

	@Override
	public String toString() {
		return "WorkPriorityMapping [workPriorityMappingId=" + workPriorityMappingId + ", priorityId=" + priorityId
				+ ", workId=" + workId + "]";
	}

}
