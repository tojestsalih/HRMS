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

import company.hrms.business.abstracts.LanguageService;
import company.hrms.core.utilities.results.DataResult;
import company.hrms.core.utilities.results.Result;
import company.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;
	
	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService= languageService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Language>> getAll(){
	
		return this.languageService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Language language) {
		return this.languageService.add(language);
	}
	@PutMapping("/update")
	public Result update(@RequestBody Language language) {
		return this.languageService.update(language);
	}
	@DeleteMapping("/delete")
	public Result delete(@RequestBody Language language) {
		return this.languageService.delete(language);
	}
}
