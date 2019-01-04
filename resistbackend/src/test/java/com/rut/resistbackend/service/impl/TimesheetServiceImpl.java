package com.rut.resistbackend.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rut.resistbackend.bean.TimesheetBean;
import com.rut.resistbackend.model.Timesheet;
import com.rut.resistbackend.model.TimesheetDetail;
import com.rut.resistbackend.service.TimesheetService;

@Service("timesheetService")
public class TimesheetServiceImpl implements TimesheetService {

	public Timesheet getTimesheetsByMonthPeriod(Date monthPeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	public Timesheet getTimesheetsByCode(String timesheetCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TimesheetDetail> getTimesheetDetailsByTimesheet(String timesheetCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TimesheetDetail> getTimesheetDetailsByMonthPeriod(Date monthPeriod) {
		// TODO Auto-generated method stub
		return null;
	}

	public void saveTimesheetDetail(TimesheetBean bean) {
		// TODO Auto-generated method stub
		
	}

	public void updateTimesheetDetail(TimesheetBean bean) {
		// TODO Auto-generated method stub
		
	}
	

}
