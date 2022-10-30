package com.example.homework1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.homework1.business.abstracts.LanguageService;
import com.example.homework1.dataAccess.abstracts.LanguageDao;
import com.example.homework1.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService  {
private LanguageDao languageDao;
@Autowired
public LanguageManager(LanguageDao languageDao) {
	super();
	this.languageDao = languageDao;
}
@Override
public List<Language> getAll(){
	return languageDao.getAll();
}
@Override
public Language add(Language language) throws Exception  {
	if(language.getName()=="")throw new Exception("Program dili boş olamaz");
	for (Language language2:getAll()) {
		if(language2.getName()==language.getName())throw new Exception("Program ismi tekrar edemez");
	}
	return  languageDao.add(language);
}
@Override
public void delete(int id) {
	languageDao.delete(id);
}
@Override
public void update(String name,int id) throws Exception {
	if(name=="")throw new Exception("Program dili boş olamaz");
	for (Language language2:getAll()) {
		if(language2.getName()==name)throw new Exception("Program ismi tekrar edemez");
	}
	languageDao.update(name,id);
}
@Override
public Language getById(int id) {
	return languageDao.getById(id);
}


}
