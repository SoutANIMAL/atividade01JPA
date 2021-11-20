package com.fernando.atividade01JPA;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public @SpringBootApplication class Atividade01JpaApplication {

	private static final Logger log = LoggerFactory.getLogger(Atividade01JpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Atividade01JpaApplication.class, args);

		log.info("Minha Primeira Aplicação");
	}

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.OAS_30)
				.apiInfo(new ApiInfoBuilder()
						.title("Atividade 01 API")
						.description("Uma API REST para o Trabalho PP ")
						.version("0.0.1-SNAPSHOT")
						.license("MIT")
						.licenseUrl("https://opensource.org/licenses/MIT")
						.build())
				.select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.build();
	}
}

