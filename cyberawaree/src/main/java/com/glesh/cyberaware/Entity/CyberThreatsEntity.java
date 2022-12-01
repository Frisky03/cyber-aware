package com.glesh.cyberaware.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_cyberthreats")
public class CyberThreatsEntity {

	
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int ctid;
	private String cttopic;
	private String description;
	
	public CyberThreatsEntity(){}
	public CyberThreatsEntity(int ctid, String cttopic, String description) {
		super();
		this.ctid = ctid;
		this.cttopic = cttopic;
		this.description = description;
	}
	
	public int getCtid() {
		return ctid;
	}
	
	public void setCtid(int ctid) {
		this.ctid = ctid;
	}

	public String getCttopic() {
		return cttopic;
	}

	public void setCttopic(String cttopic) {
		this.cttopic = cttopic;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
