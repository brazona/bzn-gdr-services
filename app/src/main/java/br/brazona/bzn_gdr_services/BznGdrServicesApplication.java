package br.brazona.bzn_gdr_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BznGdrServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(BznGdrServicesApplication.class, args);
	}

}
