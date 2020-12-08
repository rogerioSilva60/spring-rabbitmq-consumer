package br.com.rabbitmq.consumer.core.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import br.com.rabbitmq.consumer.core.amqp.ConsumerAmpq;

@Component
public class RabbitMQConsumerSecond implements ConsumerAmpq<String>{

	
	@RabbitListener(queues = "${consumer.rabbitmq.queue-name-second}")
	@Override
	public void consumer(String text) {
		try {
			System.out.println("-- "+ text + " --");
		} catch (Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}
	}

}
