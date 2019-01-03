package com.min.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.min.entity.TsRole;

@Repository
public interface RoleDao extends JpaRepository<TsRole, Long>{

}
