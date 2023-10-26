package com.module.backend.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// NB: EntityScan connects Entity class to Repo Class for Junit Testing
@SpringBootApplication
@EntityScan({"com.module.shared.entity", "com.module.backend.user"})
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
