package br.com.rabbitmq.consumer.core.amqp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.core.amqp.dto.MessageQueueDto;
import br.com.rabbitmq.consumer.core.amqp.service.ConsumerService;
import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.service.RegisterCommentService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private RegisterCommentService registerCommentService;
	
	@Override
	public void action(MessageQueueDto message) {
		Comments comment = new Comments();
		comment.setText(message.getText());
		Comments savedComment = registerCommentService.save(comment);
		System.out.println(savedComment);
	}

}
