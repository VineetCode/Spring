package com.imnzu.tech.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Employee_table")
public class Employee implements Serializable
{
	public static final long serialeVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String name;
	@Column(name="user_email")
	private String user_email;
	@Column(name="pasword")
	private String password;
	@Column(name="contry_code")
	private String contry_code;
	@Column(name="mobile")
	private String mobile;
	@Column(name="registered_on")
	private String registered_on;
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
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContry_code() {
		return contry_code;
	}
	public void setContry_code(String contry_code) {
		this.contry_code = contry_code;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getRegistered_on() {
		return registered_on;
	}
	public void setRegistered_on(String registered_on) {
		this.registered_on = registered_on;
	}
	public static long getSerialeversionuid() {
		return serialeVersionUID;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", user_email=" + user_email + ", password=" + password
				+ ", contry_code=" + contry_code + ", mobile=" + mobile + ", registered_on=" + registered_on + "]";
	}
	
	
	

}
