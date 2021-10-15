package com.howtodoinjava.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.howtodoinjava.demo.model.Folder;
import com.howtodoinjava.demo.repository.FolderRepository;
import com.howtodoinjava.demo.service.FolderService;

@Transactional
@Service
public class FolderServiceImpl implements FolderService {
	
	@Autowired
	private FolderRepository folderRepo;

	@Override
	public void rename(String newName, Long id) {
		folderRepo.renameFolder(id, newName);
		
	}

	@Override
	public void delete(Long id) {
		folderRepo.deleteById(id);
		
	}

	@Override
	public void changeLocation(List<Long> ids) {
		
	}

	@Override
	public List<Folder> getAll() {
		return folderRepo.findAll();
		
	}

	@Override
	public Folder findById(Long id) {
		return folderRepo.getOne(id);
	}

	@Override
	public void createOrupdateFolder(Folder folder) {
		folderRepo.save(folder);
		
	}

}
