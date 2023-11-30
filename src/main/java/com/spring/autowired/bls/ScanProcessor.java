package com.spring.autowired.bls;

import com.spring.autowired.ds.Scan;

import java.util.Collection;

public interface ScanProcessor {

	Collection<Scan> processScans(Collection<Scan> scans);
}
