package com.example.homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.homework1.dataAccess.abstracts.LanguageDao;
import com.example.homework1.entities.concretes.Language;

@Repository
public class InMemoryLanguageDao implements LanguageDao {
List<Language> languages;

	public InMemoryLanguageDao() {
	languages=new ArrayList<>();
	languages.add(new Language(1,"C#"));
	languages.add(new Language(2,"Phyton"));
	languages.add(new Language(3,"Java"));	
}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public Language add(Language language) {
		languages.add(language);
		return getById(language.getId());
	}

	@Override
	public void delete(int id) {
		Language deleteLanguage=getById(id);
		languages.remove(deleteLanguage);
		
	}

	@Override
	public void update(Language language, int id) {
		Language updateLanguage=getById(id);
		updateLanguage.setName(language.getName());
	}

	@Override
	public Language getById(int id) {
		for(Language language:languages)if(language.getId()==id)return language;
	return null;
	}

}
