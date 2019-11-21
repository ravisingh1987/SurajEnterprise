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
@Table(name = "user_master")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "dob")
	private String dob;

	@Column(name = "gender")
	private String gender;

	@Column(name = "district")
	private String district;

	@Column(name = "address")
	private String address;

	@Column(name = "postcode")
	private String postcode;

	@Column(name = "telephone")
	private String telephone;

	@Column(name = "bio")
	private String bio;

	@Column(name = "user_type")
	private String userType;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	private String email;

	@Column(name = "user_password")
	private String userPassword;

	@Column(name = "salt")
	private String salt;

	@Column(name = "lost_pass_token")
	private String lostPassToken;

	@Column(name = "lost_pass_expiry")
	private String lostPassExpiry;

	@Column(name = "last_login")
	private String lastLogin;

	@Column(name = "last_login_ip")
	private String lastLoginIp;

	@Column(name = "registered_id")
	private String registeredId;

	@Column(name = "active")
	private String active;

	@Column(name = "activated_date")
	private String activatedDate;

	@Column(name = "user_desc")
	private String userDesc;
	/* created_by updated_by created_date updated_date */


}
