package org.wpattern.spring.oauth2.utils;

import org.springframework.boot.autoconfigure
							.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "org.wpattern.spring.oauth2")
public class AppConfig {
	
}
