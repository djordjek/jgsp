package com.jgsp;

import java.util.logging.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GspNSBackendApplication extends SpringBootServletInitializer {
    static Logger logger = Logger.getLogger(String.valueOf(GspNSBackendApplication.class));

    public static void main(String[] args) {
        SpringApplication.run(GspNSBackendApplication.class, args);
    }
}
