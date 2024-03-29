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

import company.hrms.business.abstracts.SchoolService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.School;

@RestController
@RequestMapping("/api/schools")
public class SchoolsController {

	private SchoolService schoolService;
	@Autowired
	public SchoolsController(SchoolService schoolService) {
		this.schoolService = schoolService;
	}
	@GetMapping("/getall")
	public DataResult<List<School>> getAll(){
		return this.schoolService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
	}
	@PutMapping("/update")
	public Result update(@RequestBody School school) {
		return this.schoolService.update(school);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody School school) {
		return this.schoolService.delete(school);
	}
}
