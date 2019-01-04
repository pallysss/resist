package com.rut.resistbackend.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = Timesheet.TABLE_NAME)
public class Timesheet extends BaseEntity {
	public static final String TABLE_NAME = "TIMESHEET";
	
	@Id
	@Column(name = "code", length = 10 , nullable = false)
	private String code;
	
	@Column(name = "user_id", length = 20 , nullable = false)
	private String userId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "project")
	private Project project;
	
	@Column(name = "period")
	@Temporal(TemporalType.TIMESTAMP)
	private Date period;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "timesheet")
	private List<TimesheetDetail> timesheetDetails ;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public List<TimesheetDetail> getTimesheetDetails() {
		return timesheetDetails;
	}

	public void setTimesheetDetails(List<TimesheetDetail> timesheetDetails) {
		this.timesheetDetails = timesheetDetails;
	}
	
	
}
