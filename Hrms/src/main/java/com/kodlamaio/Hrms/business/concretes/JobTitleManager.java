package com.kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kodlamaio.Hrms.business.abstracts.JobTitleService;
import com.kodlamaio.Hrms.dataAccess.abstracts.JobTitleDao;
import com.kodlamaio.Hrms.entities.concretes.JobTitles;


@Service
public class JobTitleManager implements JobTitleService{
	
	private JobTitleDao jobTitleDao;
	

	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}



	@Override
	public List<JobTitles> getAll() {
		return this.jobTitleDao.findAll();
	}

}
