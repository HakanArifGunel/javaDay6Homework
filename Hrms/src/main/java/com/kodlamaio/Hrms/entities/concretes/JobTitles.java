package com.kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="jobtitles")


public class JobTitles {
	
	@Id
	@GeneratedValue
	
	@Column(name="jobtitle_id")
	private int jobTitleId;
	
	//@Column(name="user_id")
	//private int userId;
	
	@Column(name="jobtitle")
	private String jobTitle;
	
	public JobTitles() {
		
	}

	public JobTitles(int jobTitleId, String jobTitle) {
		super();
		this.jobTitleId = jobTitleId;
		//this.userId = userId;
		this.jobTitle = jobTitle;
	}


	
	

}
