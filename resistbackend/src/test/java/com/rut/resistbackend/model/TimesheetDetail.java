package com.rut.resistbackend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = TimesheetDetail.TABLE_NAME)
public class TimesheetDetail extends BaseEntity {
	public static final String TABLE_NAME = "TIMESHEET_DTL";

	@Id
	@Column(name = "id", length = 10 , nullable = false)
	private String id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "timesheet", nullable = false)
	private Timesheet timesheet;
	
	@Column(name = "app_code", length = 30)
	private String appCode;
	
	@Column(name = "description", length = 50)
	private String description;
	
	@Column(name = "time_in")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeIn;
	
	@Column(name = "time_Out")
	@Temporal(TemporalType.TIMESTAMP)
	private Date timeOut;
}
