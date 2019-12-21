package com.suraj.mm.model;

/**
 * @author Dilip Kirar 2019
 *
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name = "capacity")
public class Capacity extends AbstractEntity{

	@Id
	@GeneratedValue(generator="capacityInc")
	@GenericGenerator(name="capacityInc", strategy = "increment") 
	@Column(name = "capacity_id")
	private Long capacityId;

	@Column(name = "user_master_user_id")
	private String user_master_user_id;

	@Column(name = "machine_id")
	private String machine_id;

	@Column(name = "capacity_value")
	private String capacity_value;

	@Column(name = "capacity_desc")
	private String capacity_desc;

	@Column(name = "capacity_flag")
	private String capacity_flag;

	public Long getCapacityId() {
		return capacityId;
	}

	public void setCapacityId(Long capacityId) {
		this.capacityId = capacityId;
	}

	public String getUser_master_user_id() {
		return user_master_user_id;
	}

	public void setUser_master_user_id(String user_master_user_id) {
		this.user_master_user_id = user_master_user_id;
	}

	public String getMachine_id() {
		return machine_id;
	}

	public void setMachine_id(String machine_id) {
		this.machine_id = machine_id;
	}

	public String getCapacity_value() {
		return capacity_value;
	}

	public void setCapacity_value(String capacity_value) {
		this.capacity_value = capacity_value;
	}

	public String getCapacity_desc() {
		return capacity_desc;
	}

	public void setCapacity_desc(String capacity_desc) {
		this.capacity_desc = capacity_desc;
	}

	public String getCapacity_flag() {
		return capacity_flag;
	}

	public void setCapacity_flag(String capacity_flag) {
		this.capacity_flag = capacity_flag;
	}

	@Override
	public String toString() {
		return "Capacity [capacityId=" + capacityId + ", user_master_user_id=" + user_master_user_id + ", machine_id="
				+ machine_id + ", capacity_value=" + capacity_value + ", capacity_desc=" + capacity_desc
				+ ", capacity_flag=" + capacity_flag + "]";
	}

	/*
	 * created_by updated_by created_date updated_date
	 */

}
