package com.oodles.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String fullName;
	private String email;
	private Long phoneNumber;
	private String address;
	private String state;
	private String city;
	private String zipCode;
	private String aboutMe;
	public UserDetails(String aboutMe) {
		super();
		this.aboutMe = aboutMe;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public UserDetails(int id, String userName, String fullName, String email, Long phoneNumber, String address,
			String state, String city, String zipCode) {
		super();
		this.id = id;
		this.userName = userName;
		this.fullName = fullName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
	}
	public UserDetails() {}

}