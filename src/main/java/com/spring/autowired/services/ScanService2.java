package com.spring.autowired.services;

import com.spring.autowired.analyzers.DBScanAnalyzer;
import com.spring.autowired.bls.DBScanProcessor;
import com.spring.autowired.readers.DBScanReader;
import org.springframework.stereotype.Service;

@Service
public class ScanService2 {

	/**
	 * Constructor injection Example : This is the preferred way of injecting dependencies
	 * @param scanAnalyzer
	 * @param scanProcessor
	 * @param scanReader
	 */
	// Note : @Autowired is optional for constructor injection, if there is only one constructor else it is mandatory
	public ScanService2(DBScanAnalyzer scanAnalyzer, DBScanProcessor scanProcessor, DBScanReader scanReader){
		System.out.println("############### Constructor Start :: ScanService2 ###############");
		System.out.println(
				getClass().getSimpleName() + " scanAnalyzer = " + scanAnalyzer + "\n" +
				getClass().getSimpleName() + " scanProcessor = " + scanProcessor + "\n" +
				getClass().getSimpleName() + " scanReader = " + scanReader + "\n"
		);
		System.out.println("############### Constructor End :: ScanService2 ###############");
	}

}
