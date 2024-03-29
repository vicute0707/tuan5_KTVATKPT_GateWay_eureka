package com.javademo.registrydiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistryDiscoveryApplication.class, args);
    }

}
