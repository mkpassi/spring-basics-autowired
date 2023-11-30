package com.spring.autowired.bls;

import com.spring.autowired.ds.Scan;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class DBScanProcessor implements ScanProcessor{

	@Override
	public Collection<Scan> processScans(Collection<Scan> scans) {
		return Collections.emptyList();
	}
}
