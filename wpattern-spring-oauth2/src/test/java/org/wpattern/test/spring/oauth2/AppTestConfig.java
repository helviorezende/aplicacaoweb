package org.wpattern.test.spring.oauth2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.wpattern.spring.oauth2.utils.AppConfig;

@Configuration
@Import(value = { AppConfig.class })
@ComponentScan(basePackages = "org.wpattern.test.spring.oauth2")
public class AppTestConfig {
	
}

