package com.sts.configserverpoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableConfigServer
@Configuration
@EnableAutoConfiguration
public class ConfigServerPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerPocApplication.class, args);
	}

}
