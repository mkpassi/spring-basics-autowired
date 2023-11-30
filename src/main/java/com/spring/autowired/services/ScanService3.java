package com.spring.autowired.services;

import com.spring.autowired.analyzers.DBScanAnalyzer;
import com.spring.autowired.bls.DBScanProcessor;
import com.spring.autowired.interfaces.ScanOptimizer;
import com.spring.autowired.interfaces.ScanUtil;
import com.spring.autowired.readers.DBScanReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScanService3 {

	private ScanService3(DBScanAnalyzer scanAnalyzer, DBScanProcessor scanProcessor, DBScanReader scanReader,
					Optional<ScanOptimizer> scanOptimizer, @Nullable ScanOptimizer scanOptimizer2,
					@Autowired(required = false)
					ScanUtil scanUtil) {
		System.out.println("############### Constructor Start :: ScanService3 ###############");
		System.out.println(
						getClass().getSimpleName() + " scanAnalyzer = " + scanAnalyzer + "\n" +
										getClass().getSimpleName() + " scanProcessor = " + scanProcessor + "\n" +
										getClass().getSimpleName() + " scanReader = " + scanReader + "\n" +
										getClass().getSimpleName() + " scanOptimizer = " + scanOptimizer + "\n" +
										getClass().getSimpleName() + " scanOptimizer2 = " + scanOptimizer2 + "\n" +
										getClass().getSimpleName() + " scanUtil = " + scanUtil + "\n"
		);
		System.out.println("############### Constructor End :: ScanService3 ###############");

	}
}
