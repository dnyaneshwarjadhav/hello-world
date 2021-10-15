package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Report;

public interface ReportService {

	public List<Report> getAll();
	public Report findById(Long id);
	public void rename(String newName, Long id);
	public void delete(Long id);
	public void changeLocation(String newLoc, List<Long> ids);
	public void createOrupdateReport(Report report);
	
}
