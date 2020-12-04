package br.com.rabbitmq.consumer.service.impl;

import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.core.ampq.queue.MessageQueue;
import br.com.rabbitmq.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(MessageQueue message) {
		System.out.println(message.getText());
	}

}
