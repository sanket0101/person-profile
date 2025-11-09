package com.nit.novadirectory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Web configuration for the Nova Directory application.
 * 
 * Handles static resource routing for UI assets such as CSS, JavaScript,
 * images, and dependency bundles located under webjars.
 */
@Configuration
public class WebResourceConfiguration implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/assets/**")
                .addResourceLocations("classpath:/static/assets/");

        registry.addResourceHandler("/media/**")
                .addResourceLocations("classpath:/static/media/");

        registry.addResourceHandler("/vendor/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
