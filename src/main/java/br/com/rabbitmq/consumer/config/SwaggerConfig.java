package br.com.rabbitmq.consumer.config;


import java.util.function.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	@Bean
    public Docket docket(){
		Predicate<RequestHandler> basePackage = RequestHandlerSelectors
				.basePackage("br.com.rabbitmq.consumer.api.controller");
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(basePackage)
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .apiInfo(apiInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("Spring Boot RabbitMQ")
                .description("Exemplo de conexao spring com rabbitmq do lado consumer")
                .version("1.0")
                .license("Apache License Version 2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0\"")
                .contact(contact())
                .build();
    }

    private Contact contact(){
        return new Contact(
                "Rogerio Silva",
                "https://github.com/rogerioSilva60/spring-rabbitmq-producer",
                "rogeriosilva60@gmail.com"
        );
    }
}
