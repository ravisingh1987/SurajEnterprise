package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

/**
 * @author Dilip Kirar 2019
 *
 */
@Data
@Entity
@Table(name = "priority_master")
public class Priority extends AbstractEntity {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "priorityInc")
	@GenericGenerator(name = "priorityInc", strategy = "increment")
	@Column(name = "priority_id")
	private Long priorityId;

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
		return "Priority [priorityId=" + priorityId + ", priorityAll=" + priorityAll + ", nonPrioritized="
				+ nonPrioritized + ", prioritized=" + prioritized + ", priorityDesc=" + priorityDesc + "]";
	}

}
