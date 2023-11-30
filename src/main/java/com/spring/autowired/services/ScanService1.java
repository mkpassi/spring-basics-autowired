package com.spring.autowired.services;

import com.spring.autowired.analyzers.DBScanAnalyzer;
import com.spring.autowired.bls.DBScanProcessor;
import com.spring.autowired.interfaces.ScanOptimizer;
import com.spring.autowired.interfaces.ScanUtil;
import com.spring.autowired.interfaces.ScanValidator;
import com.spring.autowired.readers.DBScanReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Optional;

@Service
public class ScanService1 {

	@Autowired
	public DBScanAnalyzer dbScanAnalyzer;

	@Autowired
	public DBScanProcessor dbScanProcessor;

	@Autowired
	public DBScanReader dbscanReader;

	@Autowired
	private Optional<ScanOptimizer> dbScanOptimizer;

	@Autowired
	@Nullable
	private ScanUtil scanUtil;

	@Autowired(required = false)
	private ScanValidator scanValidator;


	// Constructor : called before the injection of dependencies
	// the value will be null as Object is not created yet, as these are all setter injection.
	public ScanService1(){
		System.out.println("############### Constructor Start :: ScanService1 ###############");
		System.out.println(
				getClass().getSimpleName() + " dbScanAnalyzer = " + dbScanAnalyzer + "\n" +
				getClass().getSimpleName() + " dbScanProcessor = " + dbScanProcessor + "\n" +
				getClass().getSimpleName() + " dbscanReader = " + dbscanReader + "\n" +
				getClass().getSimpleName() + " dbScanOptimizer = " + dbScanOptimizer + "\n" +
				getClass().getSimpleName() + " scanUtil = " + scanUtil + "\n" +
				getClass().getSimpleName() + " scanValidator = " + scanValidator + "\n"
		);
		System.out.println("############### Constructor End :: ScanService1 ###############");
	}

	// @PostConstruct : JSR-250 annotation , called after the constructor and after the injection of dependencies
	// the value will be populated as Object is created and dependencies are injected.
	@PostConstruct
	public void init(){
		System.out.println("############### PostConstruct Start :: ScanService1 ###############");
		System.out.println(
				getClass().getSimpleName() + " dbScanAnalyzer = " + dbScanAnalyzer + "\n" +
				getClass().getSimpleName() + " dbScanProcessor = " + dbScanProcessor + "\n" +
				getClass().getSimpleName() + " dbscanReader = " + dbscanReader + "\n" +
				getClass().getSimpleName() + " dbScanOptimizer = " + dbScanOptimizer + "\n" +
				getClass().getSimpleName() + " scanUtil = " + scanUtil + "\n" +
				getClass().getSimpleName() + " scanValidator = " + scanValidator + "\n"
		);
		System.out.println("############### PostConstruct End :: ScanService1 ###############");
	}

}
