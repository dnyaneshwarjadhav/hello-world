package com.howtodoinjava.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {

	@Modifying
	@Query("update TBL_REPORT f set f.VCHREPORTNAME = :newName where f.NREPORTID = :reportId")
	void renameFolder(@Param("reportId") Long reportId, @Param("newName") String newName);
	
	@Modifying
	@Query("update TBL_REPORT f set f.NFOLDERID = :newFolderLoc where f.NREPORTID = :reportId")
	void changeLocation(@Param("reportId") Long reportId, @Param("newFolderLoc") String newName);
}
