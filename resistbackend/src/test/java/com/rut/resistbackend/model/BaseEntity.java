package com.rut.resistbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseEntity {
	
	@Column(name = "created_by" , nullable = false, length = 20)
	private String createdBy;
	
	@Column(name = "modified_by", length = 20)
	private String modifiedBy;
	
	@Column(name = "created_date" , nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@Column(name = "modified_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
}
