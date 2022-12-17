package com.example.programmingLanguages.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.programmingLanguages.business.abstracts.SubTechnologyService;
import com.example.programmingLanguages.business.requests.CreateSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.DeleteSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.UpdateSubTechnologyRequest;
import com.example.programmingLanguages.business.responses.GetAllSubTechnologiesResponse;
import com.example.programmingLanguages.dataAccess.abstracts.LanguageRepository;
import com.example.programmingLanguages.dataAccess.abstracts.SubTechnologyRepository;
import com.example.programmingLanguages.entity.concretes.ProgrammingLanguage;
import com.example.programmingLanguages.entity.concretes.SubTechnology;
@Service
public class SubTechnologyManager implements SubTechnologyService {

	 private SubTechnologyRepository subTechnologyRepository;
	    private LanguageRepository languageRepository;

	    public SubTechnologyManager(SubTechnologyRepository subTechnologyRepository, LanguageRepository languageRepository) {
	        super();
	        this.subTechnologyRepository = subTechnologyRepository;
	        this.languageRepository = languageRepository;
	    }

	    @Override
	    public List<GetAllSubTechnologiesResponse> getAll() {
	        List<SubTechnology> technologies = subTechnologyRepository.findAll();
	        List<GetAllSubTechnologiesResponse> technologyResponse = new ArrayList<GetAllSubTechnologiesResponse>();
	        for (SubTechnology technology : technologies) {
	            GetAllSubTechnologiesResponse responseItem = new GetAllSubTechnologiesResponse();
	            responseItem.setId(technology.getId());
	            responseItem.setName(technology.getName());
	            technologyResponse.add(responseItem);

	        }
	        return technologyResponse;
	    }

	    @Override
	    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception {
	        SubTechnology technology = new SubTechnology();
	        ProgrammingLanguage language = this.languageRepository.findById(createSubTechnologyRequest.getLanguageId()).get();
	        if (createSubTechnologyRequest.getName().isEmpty()) {
	            throw new Exception("Teknoloji adı boş geçilemez");
	        } else if (isNameExist(createSubTechnologyRequest.getName())) throw new Exception("Teknoloji ismi tekrar edemez");
	        else {
	            technology.setName(createSubTechnologyRequest.getName());
	            technology.setLanguage(language);
	            subTechnologyRepository.save(technology);
	        }

	    }

	    private boolean isNameExist(String name) {
	        for (GetAllSubTechnologiesResponse getAllTechnologiesResponse : getAll()) {
	            if (name.equals(getAllTechnologiesResponse.getName())) {
	                return true;
	            }
	        }
	        return false;
	    }

	    private boolean isIdExist(int id) {
	        for (GetAllSubTechnologiesResponse technology : getAll()) {
	            if (technology.getId() == id) return true;
	        }
	        return false;
	    }

	    private boolean isNameEmpty(String name) {
	        if (name.isEmpty()) return true;
	        return false;
	    }

	    @Override
	    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
	        SubTechnology technology = this.subTechnologyRepository.findById(updateSubTechnologyRequest.getId()).get();
	        ProgrammingLanguage language = this.languageRepository.findById(updateSubTechnologyRequest.getLanguageId()).get();
	        if (isNameExist(updateSubTechnologyRequest.getName())) throw new Exception("Dil ismi tekrarlanamaz");
	        if (isNameEmpty(updateSubTechnologyRequest.getName())) throw new Exception("Dil ismi boş geçilemez.");
	        technology.setName(updateSubTechnologyRequest.getName());
	        technology.setLanguage(language);
	        this.subTechnologyRepository.save(technology);

	    }

	    @Override
	    public void delete(DeleteSubTechnologyRequest deleteTechnologyRequest) throws Exception {
	        if (!isIdExist(deleteTechnologyRequest.getId())) throw new Exception("Alt teknoloji bulunamadı");
	        this.subTechnologyRepository.deleteById(deleteTechnologyRequest.getId());

	    }
}
