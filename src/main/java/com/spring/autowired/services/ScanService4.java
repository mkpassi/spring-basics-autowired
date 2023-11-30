package com.spring.autowired.services;

import com.spring.autowired.readers.ScanReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ScanService4 {

	@Autowired
	List<ScanReader> scanReaders;

	@PostConstruct
	public void setSomeMethod(){
		System.out.println("############### Setter Start :: ScanService4 ###############");
		System.out.println(
				getClass().getSimpleName() + " scanReaders = " + scanReaders + "\n"
		);
		scanReaders.stream()
				.map(r -> "\t" + r.getClass().getSimpleName())
				.forEach(System.out::println);
		System.out.println("############### Setter End :: ScanService4 ###############");
	}

}
