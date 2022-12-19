package com.glesh.cyberaware.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glesh.cyberaware.Entity.ClientEntity;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Integer>{
	
	//user-defined query
}