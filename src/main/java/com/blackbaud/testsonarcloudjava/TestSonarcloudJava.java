package com.blackbaud.testsonarcloudjava;

import com.blackbaud.boot.config.CommonSpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.blackbaud.testsonarcloudjava.core", "com.blackbaud.testsonarcloudjava.resources"})
public class TestSonarcloudJava extends CommonSpringConfig {

    public static void main(String[] args) {
        SpringApplication.run(TestSonarcloudJava.class, args);
    }

}
