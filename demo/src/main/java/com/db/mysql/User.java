package com.db.mysql;

import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Id;
	private String firstName;
	private String lasttName;
	private String mobileNuber;
	private String homeumber;
	private String email;
	private Date dateOfBirth;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}
	public String getMobileNuber() {
		return mobileNuber;
	}
	public void setMobileNuber(String mobileNuber) {
		this.mobileNuber = mobileNuber;
	}
	public String getHomeumber() {
		return homeumber;
	}
	public void setHomeumber(String homeumber) {
		this.homeumber = homeumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
