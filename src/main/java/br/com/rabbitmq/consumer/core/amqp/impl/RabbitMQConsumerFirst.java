package br.com.rabbitmq.consumer.core.amqp.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rabbitmq.consumer.core.amqp.ConsumerAmpq;
import br.com.rabbitmq.consumer.core.amqp.dto.MessageQueueDto;
import br.com.rabbitmq.consumer.core.amqp.service.ConsumerService;

@Component
public class RabbitMQConsumerFirst implements ConsumerAmpq<MessageQueueDto>{

	@Autowired
	private ConsumerService consumerService;
	
	@RabbitListener(queues = "${consumer.rabbitmq.queue-name-first}")
	@Override
	public void consumer(MessageQueueDto message) {
		try {
            consumerService.action(message);
        } catch (Exception ex) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
	}

}
