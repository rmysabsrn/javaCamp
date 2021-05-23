package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobPositionsService;
import kodlamaio.hrms.entities.concretes.JobPositions;

@RestController
@RequestMapping("/api/JobPositions")
public class JobPositionsController {
	
	
	private JobPositionsService JobPositionsService; 
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		JobPositionsService = jobPositionsService;
	}

	@GetMapping("/getall")
 public List<JobPositions> getAll(){
		return this.JobPositionsService.getAll();
	}
}
