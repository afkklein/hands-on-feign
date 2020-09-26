package com.afkklein.handson.s2it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class S2itApplication {

	public static void main(String[] args) {
		SpringApplication.run(S2itApplication.class, args);
	}

}
