package com.swe645.studentsurvey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/surveys")
public class SurveyFormService {
	
	@Autowired
	private SurveyRepository surveyRepo;
	
	SurveyFormService(SurveyRepository surveyRepo){
		this.surveyRepo = surveyRepo;
	}
	
	@GetMapping("/surveyForms")
	public ResponseEntity<List<SurveyForm>> getForms() {
		return new ResponseEntity<>(surveyRepo.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/surveyForms/{id}")
	public SurveyForm getForms(@PathVariable Long id) {
		try {
			return surveyRepo.findById(id).orElseThrow(() -> new Exception("Survey Not Found"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to find Survey Form with given Id: " + id);
			return new SurveyForm();
		}
	}
	
	@PostMapping(path = "/surveyForm", consumes = "application/json")
	public ResponseEntity<SurveyForm> createForm(@RequestBody SurveyForm survey) throws Exception {
		SurveyForm form = surveyRepo.save(survey);
		if (form == null) {
	        throw new Exception("Error in POST");
	    } else {
	        return new ResponseEntity<>(form, HttpStatus.CREATED);
	    }
	}
	
	

}
