package com.glesh.cyberaware.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.glesh.cyberaware.Entity.SolutionsEntity;
import com.glesh.cyberaware.Service.SolutionsService;


@RestController
@RequestMapping("/solutions")
public class SolutionsController {
	@Autowired
	SolutionsService solnserv;
	
	//Create or Insert a student record
	@PostMapping("/postSolution")
	public SolutionsEntity insertSolution(@RequestBody SolutionsEntity solution) {
		return solnserv.insertSolution(solution);
	}
	//Read all records
	@GetMapping("/getAllSolutions")
	public List<SolutionsEntity> getAllSolutions(){
		return solnserv.getAllSolutions();
	}
	//Update a record
	@PutMapping("/putSolution")
	public SolutionsEntity putSolution(@RequestParam int solnid, @RequestBody SolutionsEntity newSolutionDetails) throws Exception{
		return solnserv.putSolution(solnid, newSolutionDetails);
	}
	//Delete a record
	@DeleteMapping("/deleteSolution/{solnid}")
	public String deleteSolution(@PathVariable int solnid) {
		return solnserv.deleteSolution(solnid);
	}
}
