package com.spring.autowired.readers;

import com.spring.autowired.ds.Scan;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Collections;

@Component
public class FileScanReader implements ScanReader, Ordered {

	@Override
	public Collection<Scan> readScans() {
		System.out.println("FileScanReader.readScans");
		return Collections.emptyList();
	}

	/**
	 * This method is used to set the order of the bean using Ordered interface
	 * Order Interface has only one method getOrder() which returns an integer value
	 * This is used to set the order of the bean, which is used by the Spring container to resolve the dependency order.
	 * @return
	 */
	@Override
	public int getOrder() {
		return 3;
	}
}
