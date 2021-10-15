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
import com.howtodoinjava.demo.model.Folder;
import com.howtodoinjava.demo.service.FolderService;

@RestController
@RequestMapping("/report")
public class FolderController {
	@Autowired
	FolderService service;

	@GetMapping
	public ResponseEntity<List<Folder>> getAllEmployees() {
		List<Folder> list = service.getAll();

		return new ResponseEntity<List<Folder>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Folder> getFolderById(@PathVariable("id") Long id) throws RecordNotFoundException {
		Folder entity = service.findById(id);

		return new ResponseEntity<Folder>(entity, new HttpHeaders(), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<Folder> createOrUpdateFolder(Folder folder) throws RecordNotFoundException {
		service.createOrupdateFolder(folder);
		return new ResponseEntity<Folder>(null, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public HttpStatus deleteFolderById(@PathVariable("id") Long id) throws RecordNotFoundException {
		service.delete(id);
		return HttpStatus.FORBIDDEN;
	}

}