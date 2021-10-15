package com.howtodoinjava.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.howtodoinjava.demo.model.AccountEntity;
import com.howtodoinjava.demo.model.EmployeeEntity;
import com.howtodoinjava.demo.model.Folder;
import com.howtodoinjava.demo.model.Report;
import com.howtodoinjava.demo.repository.AccountRepository;
import com.howtodoinjava.demo.repository.EmployeeRepository;
import com.howtodoinjava.demo.repository.FolderRepository;
import com.howtodoinjava.demo.repository.ReportRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(FolderRepository folderRepo, ReportRepository reportRepo, AccountRepository acRepo, EmployeeRepository epRepo) {
		return args -> {
			List<Folder> folder = null;
			List<Report> reports = null;
			
			try {
				folder = folderRepo.findAll();
				System.out.println(folder.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				reports = reportRepo.findAll();
				System.out.println(reports.size());
			} catch (Exception e) {
				e.printStackTrace();
			}
		};
	}
}
