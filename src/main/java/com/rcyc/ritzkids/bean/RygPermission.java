/*
 * package com.rcyc.ritzkids.bean;
 * 
 * import java.sql.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.Entity; import
 * javax.persistence.GeneratedValue; import javax.persistence.Id; import
 * javax.persistence.Table;
 * 
 * import org.springframework.boot.autoconfigure.domain.EntityScan;
 * 
 * @Entity
 * 
 * @Table(name="/ryg_employee") public class RygPermission {
 * 
 * @Id
 * 
 * @GeneratedValue
 * 
 * @Column(name="permissionId") private int permissionId;
 * 
 * @Column(name="page") private String page;
 * 
 * @Column(name="action") private String action;
 * 
 * 
 * @Column(name="createdAt") private Date createdAt;
 * 
 * @Column(name="updatedAt") private Date updatedAt;
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
 * public RygPermission() {
 * 
 * 
 * }
 * 
 * 
 * public RygPermission(int permissionId, String page, String action, Date
 * createdAt, Date updatedAt, int createdBy, int updatedBy, int isActive) {
 * super(); this.permissionId = permissionId; this.page = page; this.action =
 * action; this.createdAt = createdAt; this.updatedAt = updatedAt;
 * this.createdBy = createdBy; this.updatedBy = updatedBy; this.isActive =
 * isActive; }
 * 
 * 
 * public Date getCreatedAt() { return createdAt; }
 * 
 * 
 * public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
 * 
 * 
 * public Date getUpdatedAt() { return updatedAt; }
 * 
 * 
 * public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
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
 * public void setIs_active(int isActive) { this.isActive = isActive; }
 * 
 * 
 * public int getPermissionId() { return permissionId; }
 * 
 * 
 * public void setPermissionId(int permissionId) { this.permissionId =
 * permissionId; }
 * 
 * 
 * public String getPage() {
 * 
 * return page; }
 * 
 * public void setPage(String page) { this.page=page; }
 * 
 * 
 * public String getAction() {
 * 
 * return action; } public void setAction(String action) { this.action=action; }
 * 
 * }
 * 
 */