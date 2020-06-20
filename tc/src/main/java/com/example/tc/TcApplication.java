package com.example.tc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@MapperScan("com.example.tc")
public class TcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TcApplication.class, args);
    }

}
