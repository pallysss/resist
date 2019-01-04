package com.rut.resistbackend.service;

import java.util.Date;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.rut.resistbackend.bean.TimesheetBean;
import com.rut.resistbackend.model.Timesheet;
import com.rut.resistbackend.model.TimesheetDetail;

@Transactional(readOnly = true)
public interface TimesheetService {
	
	public Timesheet getTimesheetsByMonthPeriod(Date monthPeriod);
	public Timesheet getTimesheetsByCode(String timesheetCode);
	public List<TimesheetDetail> getTimesheetDetailsByTimesheet(String timesheetCode);
	public List<TimesheetDetail> getTimesheetDetailsByMonthPeriod(Date monthPeriod);
	@Transactional()
	public void saveTimesheetDetail(TimesheetBean bean);
	@Transactional()
	public void updateTimesheetDetail(TimesheetBean bean);
}
