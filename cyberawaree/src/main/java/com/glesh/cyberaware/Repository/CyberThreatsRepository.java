package com.glesh.cyberaware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glesh.cyberaware.Entity.CyberThreatsEntity;

@Repository
public interface CyberThreatsRepository extends JpaRepository<CyberThreatsEntity, Integer >{	
}
