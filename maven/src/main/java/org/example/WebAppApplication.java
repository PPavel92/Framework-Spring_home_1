package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(WebAppApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
