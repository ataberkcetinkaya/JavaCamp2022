package com.homework.Kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.homework.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.homework.Kodlama.io.Devs.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	
	@GetMapping("getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}
	
	@PostMapping("add")
	public void add(@RequestBody Language language) throws Exception {
		languageService.add(language);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Language language) throws Exception {
		languageService.update(language.getId(), language.getName());
	}
	
	@DeleteMapping("/delete")
	public void delete(@RequestBody Language language) {
		languageService.delete(language.getId());
	}
	
	@GetMapping("/get/{id}")
	public Language getById(@PathVariable(name = "id") int id) {
		return languageService.listById(id);
	}
}
