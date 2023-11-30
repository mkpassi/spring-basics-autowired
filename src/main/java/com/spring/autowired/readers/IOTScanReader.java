package com.spring.autowired.readers;

import com.spring.autowired.ds.Scan;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
@Order(1)
public class IOTScanReader implements ScanReader {

	@Override
	public Collection<Scan> readScans() {
		// TODO Auto-generated method stub
		System.out.println("IOTScanReader.readScans");
		return Collections.emptyList();
	}

}
