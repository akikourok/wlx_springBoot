package com.example.wlx_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.core.env.Environment;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WlxSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WlxSpringBootApplication.class, args);
    }

}
