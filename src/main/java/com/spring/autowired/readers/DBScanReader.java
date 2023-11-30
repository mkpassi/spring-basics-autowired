package com.spring.autowired.readers;

import com.spring.autowired.ds.Scan;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class DBScanReader implements ScanReader{

	@Override
	public Collection<Scan> readScans() {
		System.out.println("DBScanReader.readScans");
		return Collections.emptyList();
	}
}
