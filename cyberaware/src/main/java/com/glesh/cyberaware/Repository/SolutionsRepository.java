package com.glesh.cyberaware.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.glesh.cyberaware.Entity.SolutionsEntity;

public interface SolutionsRepository extends JpaRepository<SolutionsEntity, Integer>{
	
	//user-defined query
	List<SolutionsEntity> findByTopic(String topic);
}
