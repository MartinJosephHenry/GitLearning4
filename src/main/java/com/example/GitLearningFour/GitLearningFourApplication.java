package com.example.GitLearningFour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitLearningFourApplication {
	public static void main(String[] args) {

		System.out.println("issue1");
		System.out.println("master2");
		System.out.println("This a bug fix");
		SpringApplication.run(GitLearningFourApplication.class, args);
	}

}
