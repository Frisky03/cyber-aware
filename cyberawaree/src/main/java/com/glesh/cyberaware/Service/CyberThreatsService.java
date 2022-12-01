package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.CyberThreatsEntity;
import com.glesh.cyberaware.Repository.CyberThreatsRepository;

@Service
public class CyberThreatsService {
	@Autowired
	CyberThreatsRepository ctrepo;
	
	
	public CyberThreatsEntity insertThreat(CyberThreatsEntity threat) {
		return ctrepo.save(threat);
	}
	
	public List<CyberThreatsEntity> getAllThreats(){
		return ctrepo.findAll();
	}
	
	public CyberThreatsEntity putThreat(int ctid, CyberThreatsEntity newThreatDetails) throws Exception{
		CyberThreatsEntity threat = new CyberThreatsEntity();
		
		try {
			threat = ctrepo.findById(ctid).get();
			threat.setCttopic(newThreatDetails.getCttopic());
			threat.setDescription(newThreatDetails.getDescription());	
			return ctrepo.save(threat);
		}catch(NoSuchElementException nex) {
			throw new Exception("Cyberthreat ID " + ctid + "does not exist!");
		}
	}
	
	public String deleteThreat(int ctid) {
		String msg;
		if(ctrepo.findById(ctid) != null) {
			ctrepo.deleteById(ctid);
			msg = "Cyberthreat ID " + ctid + " is successfully deleted!";
		}
		else
			msg = "Cyberthreat ID " + ctid + " is NOT found!";
		return msg;
	}
}
