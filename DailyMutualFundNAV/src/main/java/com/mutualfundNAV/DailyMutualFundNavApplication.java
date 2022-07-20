package com.mutualfundNAV;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DailyMutualFundNavApplication {

	public static void main(String[] args) {
		SpringApplication.run(DailyMutualFundNavApplication.class, args);
	}

}
