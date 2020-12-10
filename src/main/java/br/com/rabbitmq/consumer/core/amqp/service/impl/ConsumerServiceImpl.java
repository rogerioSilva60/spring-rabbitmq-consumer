package br.com.rabbitmq.consumer.core.amqp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.core.amqp.dto.MessageQueueDto;
import br.com.rabbitmq.consumer.core.amqp.service.ConsumerService;
import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.service.RegisterCommentsGenericService;
import reactor.core.publisher.Mono;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private RegisterCommentsGenericService registerCommentService;
	
	@Override
	public void action(MessageQueueDto message) {
		Comments comment = new Comments();
		comment.setText(message.getText());
		Mono<Comments> savedCommentMono = registerCommentService.save(comment);
		Comments savedComment = savedCommentMono.block();
		System.out.println(savedComment);
	}

}
