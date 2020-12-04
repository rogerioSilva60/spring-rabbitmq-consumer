package br.com.rabbitmq.consumer.service;

import br.com.rabbitmq.consumer.core.ampq.queue.MessageQueue;

public interface ConsumerService {

	void action(MessageQueue message);
}
