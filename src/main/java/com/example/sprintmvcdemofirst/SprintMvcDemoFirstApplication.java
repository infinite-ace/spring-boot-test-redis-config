package com.example.sprintmvcdemofirst;

import org.redisson.spring.starter.RedissonAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, RedissonAutoConfiguration.class})
public class SprintMvcDemoFirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintMvcDemoFirstApplication.class, args);
	}

}
