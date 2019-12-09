package io.theforloop.autocheckoutupi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.theforloop.autocheckoutupi.controller")
public class AutoCheckoutUpiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoCheckoutUpiApplication.class, args);
	}

}
