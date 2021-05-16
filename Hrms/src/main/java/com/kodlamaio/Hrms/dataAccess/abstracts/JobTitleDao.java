package com.kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodlamaio.Hrms.entities.concretes.JobTitles;

public interface JobTitleDao extends JpaRepository<JobTitles, Integer>{

}
