package com.rcyc.ritzkids.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinTable;
///import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
import javax.persistence.Table;




@Entity
@Table(name="ryg_young_guest")
public class YoungGuestBean {
@Id
@GeneratedValue

@Column(name="young_guest_id")
private Long id;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="nickName")
private String nickName;

@Column(name="folioNumber")
private String folioNumber;

@Column(name="dateOfBirth")
private Date dateOfBirth;

@Column(name="ageGroup")
private String ageGroup;

@Column(name="stateRoom")
private String stateRoom;

@Column(name="language")
private String language;

@Column(name="tagId")
private String tagId;

@Column(name="gender")
private String gender;
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name = "guardianId", insertable = false, updatable = false)
	 * private Set<GuradianDetailsBean> gDetails;
	 */
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "fk_order") private GuardianBean gbean;
	 */

//private Set<GuradianDetailsBean> gDetails;


private Set<GuardianBean> guardian = new HashSet<GuardianBean>(0);

/*
	 * @OneToMany private Set<GuardianBean> gDetails = new HashSet<>();
	 */
	
	
	/*
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinTable(name = "ryg_guardian_d", joinColumns = @JoinColumn(name =
	 * "yDetails"), inverseJoinColumns = @JoinColumn(name = "id"))
	 * 
	 * 
	 */
	  
	/*
	 * private Set<GuradianDetailsBean> gDetails =new HashSet();
	 */
	  
	 
	
	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "ryg_guardian", catalog = "ryg_employee", joinColumns = {
	 * 
	 * @JoinColumn(name = "id", nullable = false, updatable = false) },
	 * inverseJoinColumns = { @JoinColumn(name = "id", nullable = false, updatable =
	 * false) }) public int getguardianId() { return this.getId(); }
	 */
	 
	 
	/*
	 * @ManyToOne(fetch = FetchMode.LAZY)
	 * 
	 * @JoinTable(name = "ryg_guardian_details", joinColumns = @JoinColumn(name =
	 * "guardianId"), inverseJoinColumns = @JoinColumn(name = "id"))
	 * 
	 */
	/*
	 * private Set<GuradianDetailsBean> guardianId() { return null;
	 * 
	 * }
	 */
	
	//  public String GuradianDetailsBean getGuardianDetails() { return guardianId; }
	/*
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
	 * CascadeType.MERGE }, mappedBy = "yDetails") private Set<GuradianDetailsBean>
	 * gDetails = new HashSet<>();
	 */


public YoungGuestBean(Long id, String firstName, String lastName, String nickName, String folioNumber, Date dateOfBirth,
		String ageGroup, String stateRoom, String language, String tagId, String gender) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nickName = nickName;
	this.folioNumber = folioNumber;
	this.dateOfBirth = dateOfBirth;
	this.ageGroup = ageGroup;
	this.stateRoom = stateRoom;
	this.language = language;
	this.tagId = tagId;
	this.gender = gender;
}


//public Set<GuradianDetailsBean> getgDetails() {
//	return (Set<GuradianDetailsBean>) getgDetails();
//}
//
//
//public void setgDetails(Set<GuradianDetailsBean> gDetails) {
//	this.gDetails = gDetails;
//}


@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinTable(name = "ryg_guardian_young_guest", 
	joinColumns = { 
		@JoinColumn(name = "young_guest_id") }, 
		inverseJoinColumns = { @JoinColumn(name = "guardian_id") })
public Set<GuardianBean> getGuardian() {
	return guardian;
}


public void setGuardian(Set<GuardianBean> guardian) {
	this.guardian = guardian;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
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

public String getNickName() {
	return nickName;
}

public void setNickName(String nickName) {
	this.nickName = nickName;
}

public String getFolioNumber() {
	return folioNumber;
}

public void setFolioNumber(String folioNumber) {
	this.folioNumber = folioNumber;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getAgeGroup() {
	return ageGroup;
}

public void setAgeGroup(String ageGroup) {
	this.ageGroup = ageGroup;
}

public String getStateRoom() {
	return stateRoom;
}

public void setStateRoom(String stateRoom) {
	this.stateRoom = stateRoom;
}

public String getLanguage() {
	return language;
}

public void setLanguage(String language) {
	this.language = language;
}

public String getTagId() {
	return tagId;
}

public void setTagId(String tagId) {
	this.tagId = tagId;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

}






