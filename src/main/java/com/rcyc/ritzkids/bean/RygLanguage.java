package com.rcyc.ritzkids.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

 @Table(name="/ryg_employee") 
public class RygLanguage {

@Id
 @GeneratedValue
 
@Column(name="languageId") 
private Long languageId;
 
@Column(name="English")
private String English;

@Column(name="Chinese")
private String Chinese;

@Column(name="Danish")
private String Danish;

@Column(name="French")
private String French;

@Column(name="German")
private String German;

@Column(name="Japanese")
private String Japanese;

@Column(name="Korean")
private String Korean;

@Column(name="Norwegian")
private String Norwegian;

@Column(name="Portuguese")
private String Portuguese;

@Column(name="Spanish")
private String Spanish;

@Column(name="Swedish")
private String Swedish;

public RygLanguage(Long languageId, String English, String Chinese, String Danish, String French, String german,
		String Japanese, String Korean, String Norueagian, String Portuguese, String Spanish, String Swedish) {
	super();
	this.languageId = languageId;
	this.English = English;
	this.Chinese = Chinese;
	this.Danish = Danish;
	this.French = French;
	this.German = German;
	Japanese = Japanese;
	this.Korean = Korean;
	this.Norwegian = Norwegian;
	Portuguese = Portuguese;
	this.Spanish = Spanish;
	this.Swedish = Swedish;
}

public Long getLanguageId() {
	return languageId;
}

public void setLanguageId(Long languageId) {
	this.languageId = languageId;
}

public String getEnglish() {
	return English;
}

public void setEnglish(String english) {
	this.English = english;
}

public String getChinese() {
	return Chinese;
}

public void setChinese(String chinese) {
	this.Chinese = chinese;
}

public String getDanish() {
	return Danish;
}

public void setDanish(String danish) {
	this.Danish = danish;
}

public String getFrench() {
	return French;
}

public void setFrench(String french) {
	this.French = french;
}

public String getGerman() {
	return German;
}

public void setGerman(String german) {
	this.German = German;
}

public String getJapanese() {
	return Japanese;
}

public void setJapanese(String japanese) {
	Japanese = japanese;
}

public String getKorean() {
	return Korean;
}

public void setKorean(String korean) {
	this.Korean = korean;
}

public String getNorueagian() {
	return Norwegian;
}

public void setNorueagian(String norueagian) {
	this.Norwegian = Norwegian;
}

public String getPortuguese() {
	return Portuguese;
}

public void setPortuguese(String portuguese) {
	Portuguese = portuguese;
}

public String getSpanish() {
	return Spanish;
}

public void setSpanish(String spanish) {
	this.Spanish = Spanish;
}

public String getSwedish() {
	return Swedish;
}

public void setSwedish(String swedish) {
	this.Swedish = swedish;
}
}














