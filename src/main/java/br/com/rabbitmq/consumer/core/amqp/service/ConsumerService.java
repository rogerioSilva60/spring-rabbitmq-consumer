package br.com.rabbitmq.consumer.core.amqp.service;

import br.com.rabbitmq.consumer.core.amqp.dto.MessageQueueDto;

public interface ConsumerService {

	void action(MessageQueueDto message);
}
