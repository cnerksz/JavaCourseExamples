package com.example.homework1.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homework1.business.abstracts.LanguageService;
import com.example.homework1.entities.concretes.Language;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
private LanguageService languageService;
@Autowired
public LanguagesController(LanguageService languageService) {
	super();
	this.languageService = languageService;
}
@GetMapping("/getall")
public List<Language> getAll(){
	return languageService.getAll();
}
@PostMapping("/add")
public Language add(@RequestBody Language language) throws Exception {
	return languageService.add(language);
}
@DeleteMapping("/{id}")
public void delete(@PathVariable int id) {
	languageService.delete(id);
}
@PutMapping("/{id}")
public void update(@RequestBody String name,@PathVariable int id) throws Exception{
	languageService.update(name, id);
}
@GetMapping("/{id}")
public Language getById(@PathVariable int id) {
	return languageService.getById(id);
}

}
