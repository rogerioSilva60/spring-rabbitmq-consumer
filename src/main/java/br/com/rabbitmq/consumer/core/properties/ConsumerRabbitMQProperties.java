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
	
	private String directExchangeTest="";
	//Queues
	private String queueNameFirst="";
	private String routingKeyFirst="";
	private String deadLetterFirst="";
	
	private String queueNameSecond="";
	private String routingKeySecond="";
	private String deadLetterSecond="";
}
