package com.howtodoinjava.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity(name = "ForeignKeyAssoAccountEntity")
@Table(name = "ACCOUNT", uniqueConstraints = {
@UniqueConstraint(columnNames = "ID")})
public class AccountEntity implements Serializable
{
    private static final long serialVersionUID = -6790693372846798580L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer accountId;
 
    @Column(name = "ACC_NUMBER", unique = true, nullable = false, length = 100)
    private String accountNumber;
 
    @ManyToOne
    private EmployeeEntity employee;
 
    //Getters and setters
}