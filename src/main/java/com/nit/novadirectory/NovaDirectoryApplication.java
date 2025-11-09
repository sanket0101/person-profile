package com.nit.novadirectory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Entry point for the NovaDirectory Application.
 * 
 * This application provides a simple directory system backed by MongoDB.
 */
@SpringBootApplication
public class NovaDirectoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(NovaDirectoryApplication.class, args);
    }
}
