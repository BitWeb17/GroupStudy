package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    // ??? 여기서는 뭐 하는것도 없는데
    // 왜 Controlloer가 지 멋대로 돌아가지 ???

    public static void main(String[] args) {
        System.out.println("Hello Spring~~!!~!");
        SpringApplication.run(DemoApplication.class, args);
    }
}