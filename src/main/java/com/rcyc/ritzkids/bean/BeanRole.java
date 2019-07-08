/*
 * package com.rcyc.ritzkids.bean;
 * 
 * 
 * import java.sql.Date;
 * 
 * import javax.persistence.Column; import javax.persistence.GeneratedValue;
 * import javax.persistence.Id; import javax.persistence.Table;
 * 
 * import org.hibernate.annotations.Columns; import
 * org.springframework.boot.autoconfigure.domain.EntityScan;
 * 
 * 
 * @EntityScan
 * 
 * @Table(name="/ryg_role") public class BeanRole {
 * 
 * @Id
 * 
 * @GeneratedValue
 * 
 * @Column(name="role_id") private Long role_id;
 * 
 * @Column(name="name") private String name;
 * 
 * @Column(name="description") private String description1;
 * 
 * 
 * @Column(name="created_at") private Date created_at;
 * 
 * @Column(name="updated_at") private String updated_at;
 * 
 * @Column(name="created_by") private int created_by;
 * 
 * @Column(name="updated_by") private int updated_by;
 * 
 * @Column(name="is_active")
 * 
 * private int is_active;
 * 
 * 
 * public BeanRole(Long role_id, String name, String description1, Date
 * created_at1, String updated_at1, int created_by1, int updated_by1, int
 * is_active1, Long role_id1, Long name1, String description) { super();
 * this.role_id = role_id; this.name = name; this.description1 = description1;
 * this.created_at = created_at1; this.updated_at = updated_at1; this.created_by
 * = created_by1; this.updated_by = updated_by1; this.is_active = is_active1;
 * this.role_id = role_id1; this.name = name; this.description1 = description; }
 * 
 * public Long getRole_id() { return role_id; } public void setRole_id(Long
 * role_id) { this.role_id = role_id; } public String getName() { return name; }
 * public void setName(String name) { this.name = name; } public String
 * getDescription1() { return description1; } public void setDescription1(String
 * description1) { this.description1 = description1; } public Date
 * getCreated_at() { return created_at; } public void setCreated_at(Date
 * created_at) { this.created_at = created_at; } public String getUpdated_at() {
 * return updated_at; } public void setUpdated_at(String updated_at1) {
 * this.updated_at = updated_at1; } public int getCreated_by() { return
 * created_by; } public void setCreated_by(int created_by1) { this.created_by =
 * created_by1; } public int getUpdated_by() { return updated_by; } public void
 * setUpdated_by(int updated_by1) { this.updated_by= updated_by1; } public int
 * getIs_active() { return is_active; } public void setIs_active(int is_active1)
 * { this.is_active = is_active1; } public Long getRole_id1() { return role_id;
 * } public void setRole_id1(Long role_id1) { this.role_id = role_id1; } public
 * String getName1() { return name; } public void setName1(String name1) {
 * this.name = name1; } public String getDescription() { return description1; }
 * public void setDescription(String description) { this.description1 =
 * description; } public Date getCreated_at1() { return created_at; } public
 * void setCreated_at1(Date created_at1) { this.created_at = created_at1; }
 * public String getUpdated_at1() { return updated_at; } public void
 * setUpdated_at1(String updated_at1) { this.updated_at = updated_at1; } public
 * int getCreated_by1() { return created_by; } public void setCreated_by1(int
 * created_by1) { this.created_by = created_by1; } public int getUpdated_by1() {
 * return updated_by; } public void setUpdated_by1(int updated_by1) {
 * this.updated_by = updated_by1; } public int getIs_active1() { return
 * is_active; } public void setIs_active1(int is_active1) { this.is_active =
 * is_active1; }
 * 
 * 
 * }
 * 
 * 
 * 
 */