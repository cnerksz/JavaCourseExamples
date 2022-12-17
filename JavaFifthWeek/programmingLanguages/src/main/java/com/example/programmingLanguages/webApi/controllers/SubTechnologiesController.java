package com.example.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.programmingLanguages.business.abstracts.SubTechnologyService;
import com.example.programmingLanguages.business.requests.CreateSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.DeleteSubTechnologyRequest;
import com.example.programmingLanguages.business.requests.UpdateSubTechnologyRequest;
import com.example.programmingLanguages.business.responses.GetAllSubTechnologiesResponse;

@RestController
@RequestMapping("api/subtechnolgies")
public class SubTechnologiesController {
	 private SubTechnologyService subTechnologyService;


	    public SubTechnologiesController(SubTechnologyService technologyService) {
	        this.subTechnologyService = technologyService;
	    }

	    @GetMapping("/getAll")
	    public List<GetAllSubTechnologiesResponse> getAll() {
	        return subTechnologyService.getAll();
	    }

	    @PostMapping("/add")
	    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) throws Exception {
	        this.subTechnologyService.add(createSubTechnologyRequest);
	    }

	    @PutMapping("/update")
	    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) throws Exception {
	        this.subTechnologyService.update(updateSubTechnologyRequest);

	    }

	    @DeleteMapping("/delete")
	    public void delete(DeleteSubTechnologyRequest deleteTechnologyRequest) throws Exception {
	        this.subTechnologyService.delete(deleteTechnologyRequest);
	    }
}
