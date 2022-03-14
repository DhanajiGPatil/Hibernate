package com.mavenpr1.annotationWithMaven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_info")
public class Address {
	@Id
	@Column(name = "address_id")
	private int addressId;
	
	@Column(length = 50,name ="STREET")
	private String street;
	
	private String city;
	
	@Column(name = "is_open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	
	
	
	
	
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public Address() {
		super();
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
	}
	
	
	
	
}
