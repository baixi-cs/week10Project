package com.cogent.MS2_Performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
public class Ms2PerformanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms2PerformanceApplication.class, args);
	}

}
