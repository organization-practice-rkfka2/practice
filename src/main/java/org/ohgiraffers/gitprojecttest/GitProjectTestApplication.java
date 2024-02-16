package org.ohgiraffers.gitprojecttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitProjectTestApplication {

    public static void main(String[] args) {
        System.out.println("hello world!"); //기능 추가 _ test
        SpringApplication.run(GitProjectTestApplication.class, args);
    }

}
