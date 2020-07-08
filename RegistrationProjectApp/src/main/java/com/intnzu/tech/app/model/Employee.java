package com.intnzu.tech.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;

@Entity
@Table(name ="Employee_table")
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name = "name")
	private String name;
	
	@Column(name = "user_email")
	private String userEmail;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "country_code")
	private String countryCode;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column(name = " registered_on")
	private String registeredOn;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getRegisteredOn() {
		return registeredOn;
	}

	public void setRegisteredOn(String registeredOn) {
		this.registeredOn = registeredOn;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", userEmail=" + userEmail + ", password=" + password
				+ ", countryCode=" + countryCode + ", mobileNo=" + mobileNo + ", registeredOn=" + registeredOn + "]";
	}

}
