package io.madeformaid.common;

import io.madeformaid.webmvc.context.EnableAuthContext;
import io.madeformaid.webmvc.exception.EnableGlobalExceptionHandling;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EnableAuthContext
@EnableGlobalExceptionHandling
@SpringBootApplication
public class CommonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonServiceApplication.class, args);
	}

}
