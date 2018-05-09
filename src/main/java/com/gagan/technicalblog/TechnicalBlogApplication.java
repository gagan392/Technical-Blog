package com.gagan.technicalblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation provides a load of defaults (like the embedded servlet container) depending on the contents of your classpath, and other things.
// It also turns on Spring MVC’s @EnableWebMvc annotation that activates web endpoints.
@SpringBootApplication
public class TechnicalBlogApplication {

    public static void main(String[] args) {
//      SpringApplication.run knows how to launch the web application
        SpringApplication.run(TechnicalBlogApplication.class, args);
    }

}

// curl localhost:8080 --> runs the application
// curl localhost:8080/actuator/health --> provides basic application health information
