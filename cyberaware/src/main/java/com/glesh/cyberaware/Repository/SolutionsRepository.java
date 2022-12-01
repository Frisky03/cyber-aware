package com.glesh.cyberaware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glesh.cyberaware.Entity.SolutionsEntity;

public interface SolutionsRepository extends JpaRepository<SolutionsEntity, Integer>{
	
	//user-defined query
	
}
