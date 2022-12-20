package com.glesh.cyberaware.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glesh.cyberaware.Entity.SolutionsEntity;
import com.glesh.cyberaware.Entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer>{
	
	//user-defined query
	List<UserEntity> findByUsername(String username);
	
	  Boolean existsByUsername(String username);

	  Boolean existsByType(String type);

}