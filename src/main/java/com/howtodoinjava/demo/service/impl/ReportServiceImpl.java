package com.howtodoinjava.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.model.Report;
import com.howtodoinjava.demo.repository.ReportRepository;
import com.howtodoinjava.demo.service.ReportService;

@Transactional
@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private ReportRepository reportRepo;

	@Override
	public void rename(String newName, Long id) {
		reportRepo.renameFolder(id, null);
		
	}

	@Override
	public void delete(Long id) {
		reportRepo.deleteById(id);
		
	}

	@Override
	public void changeLocation(String newLoc, List<Long> ids) {
		for(Long id: ids) {
			reportRepo.changeLocation(id, newLoc);
		}
		
	}

	@Override
	public List<Report> getAll() {
		return reportRepo.findAll();
		
	}

	@Override
	public Report findById(Long id) {
		return reportRepo.getOne(id);
	}

	@Override
	public void createOrupdateReport(Report report) {
		reportRepo.save(report);
		
	}

}
