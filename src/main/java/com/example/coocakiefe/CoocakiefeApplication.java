package com.example.coocakiefe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.coocakiefe.mapper"})
public class CoocakiefeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoocakiefeApplication.class, args);
    }

}
