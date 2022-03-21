package com.example.wlx_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WlxSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WlxSpringBootApplication.class, args);
    }

}
