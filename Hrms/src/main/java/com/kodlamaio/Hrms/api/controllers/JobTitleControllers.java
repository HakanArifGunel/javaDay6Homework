package com.kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kodlamaio.Hrms.business.abstracts.JobTitleService;
import com.kodlamaio.Hrms.entities.concretes.JobTitles;

@RestController 
@RequestMapping("/api/jobtitles")

public class JobTitleControllers {
	
	private JobTitleService jobTitleService;
	
	@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
	
	@GetMapping("/getall")
	public List<JobTitles> getAll() {
		return this.jobTitleService.getAll();
	}

}
