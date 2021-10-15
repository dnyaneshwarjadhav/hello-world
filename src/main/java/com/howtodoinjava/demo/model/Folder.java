package com.howtodoinjava.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TBL_REPORT_FOLDER")
public class Folder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "NPARENTFOLDERID", unique = true, nullable = false)
	private int NPARENTFOLDERID;

	@Column(name = "VCHOWNER")
	private String vchOwner;

	@Column(name = "NFOLDERID")
	private String nFolderId;

	@Column(name = "VCHFOLDERNAME")
	private String vchFolderName;

	@Column(name = "NFOLDERLEVEL")
	private String nFolderLevel;

	@Column(name = "VCHFOLDERTYPE")
	private String vchFolderType;

	@Column(name = "DTCREATEDATE")
	private Date dtCreateDate;

	@Column(name = "DTMODIFYDATE")
	private Date dtModifyDate;

	//@OneToMany(mappedBy = "folder")
	//@JoinColumn(name="NFOLDERID")
	
	@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="NFOLDERID")
	private List<Report> reports;
}
