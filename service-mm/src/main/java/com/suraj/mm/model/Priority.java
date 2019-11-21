package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Dilip Kirar 2019
 *
 */

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
}
