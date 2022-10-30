package com.example.homework1.business.abstracts;

import java.util.List;

import com.example.homework1.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	Language add(Language language) throws Exception;
	void delete(int id);
	void update(String name,int id) throws Exception;
	Language getById(int id);
}
