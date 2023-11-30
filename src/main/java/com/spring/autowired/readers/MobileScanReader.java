package com.spring.autowired.readers;

import com.spring.autowired.ds.Scan;
import org.springframework.stereotype.Component;

import javax.annotation.Priority;
import java.util.Collection;
import java.util.Collections;

/**
 * @Priority(2) is used to resolve the conflict between IOTScanReader and MobileScanReader
 * @Priority annotation is used to provide the order of the bean to be used in case of conflict
 */

@Component
@Priority(2)
public class MobileScanReader implements ScanReader{

	@Override
	public Collection<Scan> readScans() {
		System.out.println("MobileScanReader.readScans");
		return Collections.emptyList();
	}

}
