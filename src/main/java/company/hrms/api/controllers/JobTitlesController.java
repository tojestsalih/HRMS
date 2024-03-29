package company.hrms.api.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import company.hrms.business.abstracts.JobTitleService;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.JobTitle;

@RestController
@RequestMapping("/api/jobtitles")
public class JobTitlesController {

	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitlesController(JobTitleService jobTitleService) {
		this.jobTitleService = jobTitleService;
	}
	
	
	@GetMapping("/getall")
	public List<JobTitle>getAll(){
		return this.jobTitleService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.add(jobTitle);
	}
	@PutMapping("/update")
	public Result update(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.update(jobTitle);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody JobTitle jobTitle) {
		return this.jobTitleService.delete(jobTitle);
	}
	
}
