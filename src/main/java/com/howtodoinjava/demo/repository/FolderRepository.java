package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Folder;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {

	@Modifying
	@Query("update TBL_REPORT_FOLDER f set f.VCHFOLDERNAME = :newName where f.NPARENTFOLDERID = :nParentFolderId")
	void renameFolder(@Param("nParentFolderId") Long nParentFolderId, @Param("newName") String newName);
}
