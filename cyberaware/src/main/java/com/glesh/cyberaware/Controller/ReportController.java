package com.glesh.cyberaware.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glesh.cyberaware.Entity.ReportEntity;
import com.glesh.cyberaware.Service.ReportService;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/reports")
public class ReportController {
	@Autowired
	ReportService rserv;
	
	//Create or Insert a student record
	@PostMapping("/postReport")
	public ReportEntity insertEntity(@RequestBody ReportEntity report) {
		return rserv.insertReport(report);
	}
	//Read all records
	@GetMapping("/getAllReports")
	public List<ReportEntity> getAllReports(){
		return rserv.getAllReports();
	}
	//Update a record
	@PutMapping("/putReport")
	public ReportEntity putReport(@RequestParam int id, @RequestBody ReportEntity newReportDetails) throws Exception{
		return rserv.putReport(id, newReportDetails);
	}
	//Delete a record
	@DeleteMapping("/deleteReport/{id}")
	public String deleteReport(@PathVariable int id) {
		return rserv.deleteReport(id);
	}
	
}
