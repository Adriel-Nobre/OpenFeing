package com.feingteste.testefeig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TestefeigApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestefeigApplication.class, args);
	}

}
