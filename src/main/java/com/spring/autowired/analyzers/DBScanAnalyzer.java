package com.spring.autowired.analyzers;

import com.spring.autowired.ds.Scan;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DBScanAnalyzer implements ScanAnalyzer{

	@Override
	public void analyzeScan(Collection<Scan> scans) {
		System.out.println("DBScanAnalyzer.analyzeScan");
	}
}
