package com.ironguard.kennels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * Main entry point for the Iron Guard Kennels management application.
 * Supports both standalone JAR execution and WAR deployment to an external Tomcat server.
 */
@SpringBootApplication
public class IronGuardKennelsApplication extends SpringBootServletInitializer {

    /**
     * Configure the application when deployed as a WAR to an external Tomcat server.
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(IronGuardKennelsApplication.class);
    }

    /**
     * Starts the Spring Boot application when run as a standalone JAR.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(IronGuardKennelsApplication.class, args);
    }
}