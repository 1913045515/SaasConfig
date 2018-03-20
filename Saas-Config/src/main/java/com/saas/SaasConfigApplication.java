package com.saas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication
@EnableConfigServer
public class SaasConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(SaasConfigApplication.class, args);
    }
}
