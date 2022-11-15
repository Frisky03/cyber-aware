package com.glesh.cyberaware.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_solutions")
public class SolutionsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int solnid;
	
	private String topic;
	private String ways;
	
	public SolutionsEntity(int solnid, String topic, String ways) {
		super();
		this.solnid = solnid;
		this.topic = topic;
		this.ways = ways;
	}
	
	public SolutionsEntity() {
		super();
	}

	public int getSolnid() {
		return solnid;
	}

	public void setSolnid(int solnid) {
		this.solnid = solnid;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getWays() {
		return ways;
	}

	public void setWays(String ways) {
		this.ways = ways;
	}

	
}
