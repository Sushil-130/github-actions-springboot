package com.project.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdGithubActionApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to";
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdGithubActionApplication.class, args);
    }

}
