package com.min.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.min.entity.TsUserRole;
import com.min.entity.TsUserRoleKey;

@Repository
public interface UserRoleDao extends JpaRepository<TsUserRole, TsUserRoleKey>{

}
