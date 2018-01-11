package com.irfanstore.irfanstorezipkinserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;


@EnableZipkinStreamServer
@SpringBootApplication
public class IrfanstoreZipkinserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(IrfanstoreZipkinserverApplication.class, args);
	}
}
