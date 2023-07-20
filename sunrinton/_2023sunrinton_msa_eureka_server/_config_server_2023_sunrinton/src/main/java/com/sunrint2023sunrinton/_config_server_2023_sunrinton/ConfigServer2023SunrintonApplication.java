package com.sunrint2023sunrinton._config_server_2023_sunrinton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServer2023SunrintonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServer2023SunrintonApplication.class, args);
	}

}
