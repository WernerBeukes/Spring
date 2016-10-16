package org.werner.spring.comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Main Class File
 * @param args
 */
@SpringBootApplication
@ComponentScan
public class ComparatorApplication {
	/**
	 * Main Method to load spring application
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ComparatorApplication.class, args);
	}
}
