package com.example.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.programmingLanguages.business.abstracts.LanguageService;
import com.example.programmingLanguages.business.requests.CreateLanguageRequest;
import com.example.programmingLanguages.business.responses.GetAllLanguagesResponse;
import com.example.programmingLanguages.dataAccess.abstracts.LanguageRepository;
import com.example.programmingLanguages.entity.concretes.ProgrammingLanguage;
@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {
		List<ProgrammingLanguage> languages=languageRepository.findAll();
		List<GetAllLanguagesResponse> languageResponse=new ArrayList<GetAllLanguagesResponse>();
		for (ProgrammingLanguage language : languages) {
		GetAllLanguagesResponse responseItem=new GetAllLanguagesResponse();
		responseItem.setId(language.getId());
		responseItem.setName(language.getName());
		languageResponse.add(responseItem);
		}
		return languageResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		ProgrammingLanguage programmingLanguage=new ProgrammingLanguage();
		programmingLanguage.setName(createLanguageRequest.getName());
		this.languageRepository.save(programmingLanguage);
	}


}
