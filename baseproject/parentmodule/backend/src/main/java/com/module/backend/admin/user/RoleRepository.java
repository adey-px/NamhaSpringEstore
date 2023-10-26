package com.module.backend.admin.user;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.module.shared.entity.RoleEntity;

// Interface extends RoleEntity for DB from Shared module 
@Repository
public interface RoleRepository extends CrudRepository<RoleEntity, Integer> {
    
}
