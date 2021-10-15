package com.howtodoinjava.demo.service;

import java.util.List;

import com.howtodoinjava.demo.model.Folder;

public interface FolderService {
	
	public List<Folder> getAll();
	public Folder findById(Long id);
	public void rename(String newName, Long id);
	public void delete(Long id);
	public void changeLocation(List<Long> ids);
	public void createOrupdateFolder(Folder folder);
	
}
