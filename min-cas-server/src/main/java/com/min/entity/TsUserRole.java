package com.min.entity;
// Generated 2018-8-19 21:26:30 by Hibernate Tools 4.3.1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TsUserRole generated by hbm2java
 */
@Entity
@Table(name = "ts_user_role", catalog = "blog")
@IdClass(TsUserRoleKey.class)
public class TsUserRole implements java.io.Serializable {

	private Long userId;
	private Long roleId;
	private Date createTime;
	private Date updateTime;
	private Integer jpaVersion;

	public TsUserRole() {
	}

	public TsUserRole(Long userId, Long roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	public TsUserRole(Long userId, Long roleId, Date createTime, Date updateTime, Integer jpaVersion) {
		this.userId = userId;
		this.roleId = roleId;
		this.createTime = createTime;
		this.updateTime = updateTime;
		this.jpaVersion = jpaVersion;
	}

	
	@Id
	@Column(name = "user_id", nullable = false)
	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@Id
	@Column(name = "role_id", nullable = false)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
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