package edu.helmutsiegel.fakebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class FakeBookApplication {

    public static void main(String[] args) {
        SpringApplication.run(FakeBookApplication.class, args);
    }

}
