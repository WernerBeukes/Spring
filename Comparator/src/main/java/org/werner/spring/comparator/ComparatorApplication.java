package org.werner.spring.comparator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.File;

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
