package com.example.GitLearningFour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitLearningFourApplication {
	public static void main(String[] args) {

		System.out.println("master2");
		SpringApplication.run(GitLearningFourApplication.class, args);
	}

	void feature(){
		System.out.println("feature");
		System.out.println("feature2");
		System.out.println("rebase git");
	}

	void bugfix(){
		System.out.println("Bug fix");
		System.out.println("Bug fix 2");
	}


}
