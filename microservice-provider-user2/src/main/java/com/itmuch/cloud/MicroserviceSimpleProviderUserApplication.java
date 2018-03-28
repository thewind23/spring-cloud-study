package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableDiscoveryClient
class MicroserviceSimpleProviderUser2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderUser2Application.class, args);
	}
}
