package com.glesh.cyberaware.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.glesh.cyberaware.Entity.ReportEntity;

@Repository
public interface ReportRepository extends JpaRepository<ReportEntity, Integer>{

}
