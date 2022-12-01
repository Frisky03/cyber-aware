package com.glesh.cyberaware.Service;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glesh.cyberaware.Entity.SolutionsEntity;
import com.glesh.cyberaware.Repository.SolutionsRepository;


@Service
public class SolutionsService {
	
	@Autowired
	SolutionsRepository solnrepo;
	
	//C - Create or Insert a solution record
	public SolutionsEntity insertSolution(SolutionsEntity solution) {
		return solnrepo.save(solution);
	}
	
	//R - Read all record from the table named tbl_solution
	public List<SolutionsEntity> getAllSolutions(){
		return solnrepo.findAll();
	}
	//U - Update a solution record
	public SolutionsEntity putSolution(int solnid, SolutionsEntity newSolutionDetails) throws Exception {
		SolutionsEntity solution = new SolutionsEntity();
		
		try {
			//steps in updating
			//Step 1 - search the id number of the solution
			solution = solnrepo.findById(solnid).get();
			
			//Step 2 - update the record
			solution.setTopic(newSolutionDetails.getTopic());
			solution.setWays(newSolutionDetails.getWays());
			
			//Step 3 - save the information and return the value
			return solnrepo.save(solution);
		}catch(NoSuchElementException nex) {
			throw new Exception("ID Number " + solnid + " does not exist!");
		}
	}
	//D - Delete a solution record
	public String deleteSolution(int solnid) {
		String msg;
		if(solnrepo.findById(solnid) != null) { //step 1 - find the reocrd
			solnrepo.deleteById(solnid);		//step 2 - delete the record
			
			msg = "Solution ID Number " + solnid + " is successfully deleted!";
		}else {
			msg = "Solution ID Number " + solnid + " is NOT found!";
		}
		return msg;
	}
}
