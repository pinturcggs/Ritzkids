package com.rcyc.ritzkids.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


//@Entity
//@Table(name="ryg_guardian_details")

public class GuradianDetailsBean {
@Id
@GeneratedValue
@Column(name="guardianId")
private Long  guardianId;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="bookingNumber")
private int bookingNumber;

@Column(name="suiteNumber")
private int suiteNumber;

@Column(name="passNumber")
private int passNumber;

@Column(name="folioNumber")
private int folioNumber;

@Column(name="packegeType")
private String packegeType;

@Column(name="checkInDate")
private java.sql.Date checkInDate;

@Column(name="kidsList")
private String kidsList;

public GuradianDetailsBean() {
	
}

	
	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "ryg_youngest_table", catalog = "ryg_employee", joinColumns
	 * = {
	 * 
	 * @JoinColumn(name = "id", nullable = false, updatable = false) },
	 * inverseJoinColumns = { @JoinColumn(name = "id", nullable = false, updatable =
	 * false) }) public Set<YoungGuestBean> getId() { return this.getId(); }
	 */

@ManyToMany(fetch = FetchType.LAZY,
cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
})
@JoinTable(name = "guardian_younggest",
joinColumns = { @JoinColumn(name = "g_id") },
inverseJoinColumns = { @JoinColumn(name = "y_id") })
private Set<YoungGuestBean> yDetails = new HashSet<>();

	 
	 

public GuradianDetailsBean(String firstName, String lastName, int bookingNumber, int suiteNumber, int passNumber,
		int folioNumber, String packegeType, java.sql.Date checkInDate, String kidsList) {
	super();
	firstName = firstName;
	lastName = lastName;
	bookingNumber = bookingNumber;
	suiteNumber = suiteNumber;
	passNumber = passNumber;
	folioNumber = folioNumber;
	packegeType = packegeType;
	checkInDate = checkInDate;
	kidsList = kidsList;
}



public Long getGuardianId() {
	return guardianId;
}



public void setGuardianId(Long guardianId) {
	this.guardianId = guardianId;
}



public Set<YoungGuestBean> getyDetails() {
	return yDetails;
}



public void setyDetails(Set<YoungGuestBean> yDetails) {
	this.yDetails = yDetails;
}



public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	lastName = lastName;
}

public int getBookingNumber() {
	return bookingNumber;
}

public void setBookingNumber(int bookingNumber) {
	bookingNumber = bookingNumber;
}

public int getSuiteNumber() {
	return suiteNumber;
}

public void setSuiteNumber(int suiteNumber) {
	suiteNumber = suiteNumber;
}

public int getPassNumber() {
	return passNumber;
}

public void setPassNumber(int passNumber) {
	passNumber = passNumber;
}


public int getFolioNumber() {
	return folioNumber;
}

public void setFolioNumber(int folioNumber) {
	folioNumber = folioNumber;
}

public String getPackegeType() {
	return packegeType;
}

public void setPackegeType(String packegeType) {
	packegeType = packegeType;
}

public java.sql.Date getCheckInDate() {
	return checkInDate;
}

public void setCheckInDate(java.sql.Date checkInDate) {
	checkInDate = checkInDate;
}

public String getKidsList() {
	return kidsList;
}

public void setKidsList(String kidsList) {
	kidsList = kidsList;
}

}







