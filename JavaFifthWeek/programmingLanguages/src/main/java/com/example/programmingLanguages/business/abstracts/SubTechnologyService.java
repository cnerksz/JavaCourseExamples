package com.example.programmingLanguages.business.abstracts;

import java.util.List;

import com.example.programmingLanguages.business.requests.CreateSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.DeleteSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.UpdateSubTechnologyRequest;
import com.example.programmingLanguages.business.responses.GetAllSubTechnologiesResponse;

public interface SubTechnologyService {
		List<GetAllSubTechnologiesResponse> getAll();

	    void add(CreateSubTechnologyRequest createTechnologyRequest) throws Exception;

	    void update(UpdateSubTechnologyRequest updateTechnologyRequest) throws Exception;

	    void delete(DeleteSubTechnologyRequest deleteTechnologyRequest) throws Exception;
}
