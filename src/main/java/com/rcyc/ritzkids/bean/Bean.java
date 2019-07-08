/*
 * package com.rcyc.ritzkids.bean;
 * 
 * import java.sql.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * import org.springframework.boot.autoconfigure.domain.EntityScan;
 * 
 * @EntityScan
 * 
 * @Table(name="/ryg_employee") public class Bean {
 * 
 * @Id
 * 
 * @GeneratedValue
 * 
 * @Column(name="employeeId") private Long employeeId;
 * 
 * @Column(name="roleId") private Long roleId;
 * 
 * @Column(name="userName") private String userName;
 * 
 * 
 * @Column(name="createdAt") private Date createdAt;
 * 
 * @Column(name="updatedAt") private String updatedAt;
 * 
 * @Column(name="createdBy") private int createdBy;
 * 
 * @Column(name="updatedBy") private int updatedBy;
 * 
 * @Column(name="isActive")
 * 
 * private int isActive;
 * 
 * 
 * public Bean() {
 * 
 * 
 * }
 * 
 * 
 * public Bean(Long employeeId, Long roleId, String userName, Date createdAt,
 * String updatedAt, int createdBy, int updatedBy, int isActive) { super();
 * this.employeeId = employeeId; this.roleId = roleId; this.userName = userName;
 * this.createdAt = createdAt; this.updatedAt = updatedAt; this.createdBy =
 * createdBy; this.updatedBy = updatedBy; this.isActive= isActive; }
 * 
 * 
 * 
 * 
 * 
 * 
 * public Long getEmployeeId() { return employeeId; }
 * 
 * 
 * public void setEmployeeId(Long employee_id) { this.employeeId = employeeId; }
 * 
 * 
 * public Long getRoleId() { return roleId; }
 * 
 * 
 * public void setRole_id(Long roleId) { this.roleId = roleId; }
 * 
 * 
 * public String getUserName() { return userName; }
 * 
 * 
 * public void setUserName(String userName) { this.userName = userName; }
 * 
 * 
 * public Date getCreatedAt() { return createdAt; }
 * 
 * 
 * public void setCreated_at(Date createdAt) { this.createdAt = createdAt; }
 * 
 * 
 * public String getUpdatedAt() { return updatedAt; }
 * 
 * 
 * public void setUpdatedAt(String updatedAt) { this.updatedAt = updatedAt; }
 * 
 * 
 * public int getCreatedBy() { return createdBy; }
 * 
 * 
 * public void setCreatedBy(int createdBy) { this.createdBy = createdBy; }
 * 
 * 
 * public int getUpdatedBy() { return updatedBy; }
 * 
 * 
 * public void setUpdated_by(int updatedBy) { this.updatedBy = updatedBy; }
 * 
 * 
 * public int getIsActive() { return isActive; }
 * 
 * 
 * public void setIsActive(int isActive) { this.isActive = isActive; }
 * 
 * 
 * }
 * 
 * 
 * 
 */