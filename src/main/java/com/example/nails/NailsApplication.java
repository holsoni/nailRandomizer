package com.example.nails;

import com.example.nails.controller.Rest;
import com.example.nails.data.FakeData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(NailsApplication.class, args);
        FakeData data = new FakeData();
        data.getManicures().forEach(System.out::println);
    }
}