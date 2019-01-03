package com.min.entity;
// Generated 2018-8-19 21:26:30 by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TsRole generated by hbm2java
 */
@Entity
@Table(name = "ts_role_resource", catalog = "blog")
public class TsRoleResource implements java.io.Serializable {

	private Long roleId;
	private Long resourceId;
	private Date createTime;
	private Date updateTime;
	private Integer jpaVersion;

	public TsRoleResource() {
	}

	public TsRoleResource(Long roleId, Long resourceId) {
		this.roleId = roleId;
		this.resourceId = resourceId;
	}

	public TsRoleResource(Long roleId, Long resourceId, Date createTime, Date updateTime, Integer jpaVersion) {
		this.roleId = roleId;
		this.resourceId = resourceId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.jpaVersion = jpaVersion;
	}

	
	@Id
	@Column(name = "role_id", nullable = false)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Id
	@Column(name = "resource_id", nullable = false)
	public Long getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(Long resourceId) {
		this.resourceId = resourceId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "update_time", length = 19)
	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Column(name = "jpa_version", nullable = false)
	public Integer getJpaVersion() {
		return this.jpaVersion;
	}

	public void setJpaVersion(Integer jpaVersion) {
		this.jpaVersion = jpaVersion;
	}

}
