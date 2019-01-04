package com.rut.resistbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = Project.TABLE_NAME)
public class Project extends BaseEntity {

	public static final String TABLE_NAME = "RS_PROJECT";
	
	@Id
	@Column(name = "id", length = 10 , nullable = false)
	private String id;
	
	@Column(name = "id", length = 100 , nullable = false)
	private String name;
	
}
