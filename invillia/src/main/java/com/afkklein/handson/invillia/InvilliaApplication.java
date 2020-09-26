package com.afkklein.handson.invillia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.afkklein.handson.invillia.clients")
@EnableDiscoveryClient
public class InvilliaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvilliaApplication.class, args);
    }

}
