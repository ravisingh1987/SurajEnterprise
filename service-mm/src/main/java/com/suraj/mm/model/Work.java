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
@Table(name = "work")
public class Work {
	@Id
	@GeneratedValue
	@Column(name = "work_id")
	private Long workId;
	
	@Column(name = "user_master_user_id")
	private String userMasterUserId;
	
	@Column(name = "party_name")
	private String partyName;
	
	@Column(name = "issue_date")
	private String issueDate;
	
	@Column(name = "top")
	private String top;
	
	@Column(name = "pant")
	private String pant;
	
	@Column(name = "size")
	private String size;
	
	@Column(name = "qty")
	private String qty;
	
	@Column(name = "work_name")
	private String workName;
	
	@Column(name = "work_desc")
	private String workDesc;
	/* created_by updated_by created_date updated_date */
	
	@Column(name = "work_flag")
	private String workFlag;
}
