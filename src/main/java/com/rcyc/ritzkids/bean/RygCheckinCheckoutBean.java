/*
 * package com.rcyc.ritzkids.bean;
 * 
 * import java.util.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * import org.springframework.boot.autoconfigure.domain.EntityScan;
 * 
 * @Entity
 * 
 * @Table(name="/ryg__checkin_checkout")
 * 
 * public class RygCheckinCheckoutBean {
 * 
 * @Id
 * 
 * @GeneratedValue
 * 
 * @Column(name="checkinCheckoutId") private Long checkinCheckoutId;
 * 
 * @Column(name="firstName") private String firstName;
 * 
 * @Column(name="lastName") private String lastName;
 * 
 * @Column(name="nickName") private String nickName;
 * 
 * @Column(name="activity") private Long activity;
 * 
 * @Column(name="age") private int age;
 * 
 * 
 * @Column(name="ageGroup") private Long ageGroup;
 * 
 * @Column(name="status") private String status;
 * 
 * 
 * public RygCheckinCheckoutBean(Long checkinCheckoutId, String firstName,
 * String lastName, String suiteNumber, Long passNumber, Long folioNumber,
 * String packageType, Date checkInDate) { super(); this.checkinCheckoutId =
 * checkinCheckoutId; this.firstName = firstName; this.lastName = lastName;
 * this.nickName = nickName; this.activity=activity; this.age = age; this.status
 * = status; }
 * 
 * 
 * public Long getCheckinCheckoutId() { return checkinCheckoutId; } public void
 * setCheckinCheckoutId(Long checkinCheckoutId) { this.checkinCheckoutId =
 * checkinCheckoutId; } public String getFirstName() { return firstName; }
 * public void setFirstName(String firstName) { this.firstName = firstName; }
 * public String getLastName() { return lastName; } public void
 * setLastName(String lastName) { this.lastName = lastName; }
 * 
 * public String getNickName() { return nickName; }
 * 
 * 
 * public void setNickName(String nickName) { nickName = nickName; }
 * 
 * 
 * public Long getActivity() { return activity; }
 * 
 * 
 * public void setActivity(Long activity) { activity = activity; }
 * 
 * 
 * public int getAge() { return age; }
 * 
 * 
 * public void setAge(int age) { age = age; }
 * 
 * 
 * public Long getAgeGroup() { return ageGroup; }
 * 
 * 
 * public void setAgeGroup(Long ageGroup) { ageGroup = ageGroup; }
 * 
 * 
 * public String getStatus() { return status; }
 * 
 * 
 * public void setStatus(String status) { status = status; }
 * 
 * }
 */