package com.rcyc.ritzkids.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ryg_guardian")
public class GuardianBean {
	@Id
	@GeneratedValue

	@Column(name="guardian_id")
	private Long id;

	@Column(name="firstName")
	private String firstName;

	@Column(name="lastName")
	private String lastName;

	@Column(name="NickName")
	private String NickName;

	@Column(name="folioNumber")
	private int folioNumber;

	@Column(name="dateOfBirth")
	private int dateOfBirth;

	@Column(name="ageGroup")
	private int ageGroup;

	@Column(name="stateroom")
	private int stateroom;

	@Column(name="language")
	private String language;

	@Column(name="tagId")
	private String tagId;

	@Column(name="gender")
	private String gender;
	
	private Set<YoungGuestBean> youngGuest = new HashSet<YoungGuestBean>(0);
	

	public GuardianBean(Long id, String firstName, String lastName, String nickName, int folioNumber, int dateOfBirth,
			int ageGroup, int stateroom, String language, String tagId, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		NickName = nickName;
		this.folioNumber = folioNumber;
		this.dateOfBirth = dateOfBirth;
		this.ageGroup = ageGroup;
		this.stateroom = stateroom;
		this.language = language;
		this.tagId = tagId;
		this.gender = gender;
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
		return NickName;
	}

	public void setNickName(String nickName) {
		NickName = nickName;
	}

	public int getFolioNumber() {
		return folioNumber;
	}

	public void setFolioNumber(int folioNumber) {
		this.folioNumber = folioNumber;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(int ageGroup) {
		this.ageGroup = ageGroup;
	}

	public int getStateroom() {
		return stateroom;
	}

	public void setStateroom(int stateroom) {
		this.stateroom = stateroom;
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
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "ryg_young_guest")
	public Set<YoungGuestBean> getYoungGuest() {
		return youngGuest;
	}

	public void setYoungGuest(Set<YoungGuestBean> youngGuest) {
		this.youngGuest = youngGuest;
	}


}	











