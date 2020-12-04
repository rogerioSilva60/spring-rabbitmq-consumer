package br.com.rabbitmq.consumer.core.ampq.impl;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.rabbitmq.consumer.core.ampq.ConsumerAmpq;
import br.com.rabbitmq.consumer.core.ampq.queue.MessageQueue;
import br.com.rabbitmq.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements ConsumerAmpq<MessageQueue>{

	@Autowired
	private ConsumerService consumerService;
	
	@RabbitListener(queues = "${consumer.rabbitmq.routing-key}")
	@Override
	public void consumer(MessageQueue message) {
		try {
            consumerService.action(message);
        } catch (Exception ex) {
            throw new AmqpRejectAndDontRequeueException(ex);
        }
	}

}
