package br.com.rabbitmq.consumer.core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Component
@ConfigurationProperties("consumer.rabbitmq")
public class ConsumerRabbitMQProperties {
	
	private String exchange="";
	private String routingKey="";
	private String deadLetter="";
}
