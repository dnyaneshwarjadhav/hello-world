package com.howtodoinjava.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.exception.RecordNotFoundException;
import com.howtodoinjava.demo.model.Report;
import com.howtodoinjava.demo.service.ReportService;

@RestController
@RequestMapping("/report")
public class ReportController {
	@Autowired
	ReportService service;

	@GetMapping
	public ResponseEntity<List<Report>> getAllEmployees() {
		List<Report> list = service.getAll();

		return new ResponseEntity<List<Report>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Report> getEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		Report entity = service.findById(id);

		return new ResponseEntity<Report>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Report> createOrUpdateEmployee(Report employee)
			throws RecordNotFoundException {
		service.createOrupdateReport(employee);
		return new ResponseEntity<Report>(null, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.delete(id);
		return HttpStatus.FORBIDDEN;
	}

}