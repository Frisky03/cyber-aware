package com.glesh.cyberaware.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glesh.cyberaware.Entity.LoginUserEntity;

@Repository
public interface LoginRepository extends JpaRepository<LoginUserEntity, Integer >{	
}
