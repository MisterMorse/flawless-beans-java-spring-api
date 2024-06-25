package com.mistermorse.flawlessbeansjavaspringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan("com.mistermorse.flawlessbeansjavaspringapi")
public class FlawlessBeansJavaSpringApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlawlessBeansJavaSpringApiApplication.class, args);
	}

}
