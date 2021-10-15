package com.howtodoinjava.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_REPORT")
public class Report {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NREPORTID", unique = true, nullable = false)
	private int nreportId;

	@Column(name = "VCHOWNER")
	private String vchowner;

//	@Column(name = "NFOLDERID")
//	private String nfolderId;

	@Column(name = "VCHREPORTNAME")
	private String vchReportName;

	@Column(name = "VCHURL")
	private String vchUrl;

	@Column(name = "DTMODIFYDATE")
	private Date dtModifyDate;
	
	@ManyToOne
	//@JoinColumn(name="nparentfolderid", nullable=false)
	private Folder folder;

}
