package fr.CCI.Java.boulangerievuemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("fr.CCI.Java.boulangerievuemicroservice")
public class BoulangerieVueMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoulangerieVueMicroserviceApplication.class, args);
	}

}
