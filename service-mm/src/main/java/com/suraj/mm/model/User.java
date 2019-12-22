package com.suraj.mm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "user_master")
public class User extends AbstractEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="userInc")
	@GenericGenerator(name="userInc", strategy = "increment") 
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getLostPassToken() {
		return lostPassToken;
	}

	public void setLostPassToken(String lostPassToken) {
		this.lostPassToken = lostPassToken;
	}

	public String getLostPassExpiry() {
		return lostPassExpiry;
	}

	public void setLostPassExpiry(String lostPassExpiry) {
		this.lostPassExpiry = lostPassExpiry;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getRegisteredId() {
		return registeredId;
	}

	public void setRegisteredId(String registeredId) {
		this.registeredId = registeredId;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getActivatedDate() {
		return activatedDate;
	}

	public void setActivatedDate(String activatedDate) {
		this.activatedDate = activatedDate;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob
				+ ", gender=" + gender + ", district=" + district + ", address=" + address + ", postcode=" + postcode
				+ ", telephone=" + telephone + ", bio=" + bio + ", userType=" + userType + ", userName=" + userName
				+ ", email=" + email + ", userPassword=" + userPassword + ", salt=" + salt + ", lostPassToken="
				+ lostPassToken + ", lostPassExpiry=" + lostPassExpiry + ", lastLogin=" + lastLogin + ", lastLoginIp="
				+ lastLoginIp + ", registeredId=" + registeredId + ", active=" + active + ", activatedDate="
				+ activatedDate + ", userDesc=" + userDesc + "]";
	}

}
