package com.example.programmingLanguages.business.abstracts;

import java.util.List;

import com.example.programmingLanguages.business.requests.CreateLanguageRequest;
import com.example.programmingLanguages.business.responses.GetAllLanguagesResponse;

public interface LanguageService {
	List<GetAllLanguagesResponse> getAll();
	void add(CreateLanguageRequest createLanguageRequest);
	
}
