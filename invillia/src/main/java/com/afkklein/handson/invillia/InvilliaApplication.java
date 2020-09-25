package com.afkklein.handson.invillia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients("com.afkklein.handson.invillia.clients")
public class InvilliaApplication {

    public static void main(String[] args) {
        SpringApplication.run(InvilliaApplication.class, args);
    }

}
