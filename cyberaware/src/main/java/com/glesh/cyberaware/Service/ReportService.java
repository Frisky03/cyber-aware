package com.glesh.cyberaware.Service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.ReportEntity;
import com.glesh.cyberaware.Repository.ReportRepository;

@Service
public class ReportService {
	
	@Autowired
	ReportRepository rrepo;
	
	//C - Create or Insert a solution record
		public ReportEntity insertReport(ReportEntity report) {
			return rrepo.save(report);
		}
		
		//R - Read all record from the table named tbl_solution
		public List<ReportEntity> getAllReports(){
			return rrepo.findAll();
		}
		
		//U - Update a solution record
		public ReportEntity putReport(int id, ReportEntity newReportDetails) throws Exception {
			ReportEntity report = new ReportEntity();
			
			try {
				//steps in updating
				//Step 1 - search the id number of the solution
				report = rrepo.findById(id).get();
				
				//Step 2 - update the record
				report.setName(newReportDetails.getName());
				report.setEmail(newReportDetails.getEmail());
				report.setPhone(newReportDetails.getPhone());
				report.setMessage(newReportDetails.getMessage());
				//Step 3 - save the information and return the value
				return rrepo.save(report);
			}catch(NoSuchElementException nex) {
				throw new Exception("Report ID Number " + id + " does not exist!");
			}
		}
		//D - Delete a solution record
		public String deleteReport(int id) {
			String msg;
			if(rrepo.findById(id) != null) { //step 1 - find the reocrd
				rrepo.deleteById(id);		//step 2 - delete the record
				
				msg = "Report ID Number " + id + " is successfully deleted!";
			}else {
				msg = "Report ID Number " + id + " is NOT found!";
			}
			return msg;
		}
}