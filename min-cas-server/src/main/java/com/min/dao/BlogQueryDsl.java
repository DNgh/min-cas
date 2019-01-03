package com.min.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.min.entity.QTsResource;
import com.min.entity.QTsRole;
import com.min.entity.QTsRoleResource;
import com.min.entity.QTsUser;
import com.min.entity.QTsUserRole;
import com.min.entity.SecuritySource;
import com.min.entity.TsResource;
import com.min.entity.TsRole;
import com.querydsl.jpa.impl.JPAQuery;

@Repository
public class BlogQueryDsl {
	@PersistenceContext
	private EntityManager em;
	
	private QTsRole qTsRole = QTsRole.tsRole;
	
	private QTsUser qTsUser = QTsUser.tsUser;
	
	private QTsUserRole qTsUserRole = QTsUserRole.tsUserRole;
	
	private QTsResource qTsResource = QTsResource.tsResource;
	
	private QTsRoleResource qTsRoleResource = QTsRoleResource.tsRoleResource;
	
	public List<TsRole> fetchRoleByUserId(Long userId) {
		JPAQuery<TsRole> query = new JPAQuery<TsRole>(em);
		List<TsRole> list = query.from(qTsRole, qTsUser, qTsUserRole)
				.where(qTsRole.id.eq(qTsUserRole.roleId)
						.and(qTsUserRole.userId.eq(qTsUser.id))
						.and(qTsUser.id.eq(userId)))
				.orderBy(qTsRole.createTime.asc())
				.fetch();
		return list;
	}

	public List<SecuritySource> fetchSecuritySource() {
		List<SecuritySource> list = new ArrayList<SecuritySource>();
		//加载角色
		JPAQuery<TsRole> query = new JPAQuery<TsRole>(em);
		List<TsRole> roleList = query.from(qTsRole).fetch();
		
		if(roleList != null) {
			for(TsRole role : roleList) {
				//加载权限
				JPAQuery<TsResource> resQuery = new JPAQuery<TsResource>(em);
				List<TsResource> resList = resQuery.from(qTsResource, qTsRoleResource)
						.where(qTsRoleResource.roleId.eq(role.getId())
								.and(qTsResource.id.eq(qTsRoleResource.resourceId)))
						.fetch();
				if(resList != null) {
					for(TsResource res : resList) {
						SecuritySource source = new SecuritySource(res.getName(), role.getName());
						list.add(source);
					}
				}
			}
			
		}
		
		return list;
	}
	
	
}
