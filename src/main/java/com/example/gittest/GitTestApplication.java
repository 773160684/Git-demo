package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
        System.out.println("你好");
        System.out.println("我是master");
        System.out.println("我是hot-fix");
        System.out.println("我是hot-fix2");
    }

}
