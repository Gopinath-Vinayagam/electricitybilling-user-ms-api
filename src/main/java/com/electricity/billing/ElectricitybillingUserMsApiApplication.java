package com.electricity.billing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class ElectricitybillingUserMsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectricitybillingUserMsApiApplication.class, args);
	}

}
