package com.booking.core.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

	
	private Integer user_id;

	
	private String userName;

	
	private Integer phoneNo;

	
	private String Address;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getUserId() {
		return user_id;
	}

	public void setUserId(Integer userId) {
		this.user_id = userId;
	}

	@Column(name = "user_name")
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "phone_no")
	public Integer getPhoneNo() {
		return phoneNo;			
	}

	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Column(name = "Address")
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + user_id + ", userName=" + userName + ", phoneNo=" + phoneNo + ", Address=" + Address
				+ "]";
	}

}
