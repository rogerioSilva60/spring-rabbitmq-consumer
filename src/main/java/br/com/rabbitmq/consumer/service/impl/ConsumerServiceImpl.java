package br.com.rabbitmq.consumer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.core.ampq.queue.MessageQueue;
import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.service.RegisterCommentService;
import br.com.rabbitmq.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Autowired
	private RegisterCommentService registerCommentService;
	
	@Override
	public void action(MessageQueue message) {
		Comments comment = new Comments();
		comment.setText(message.getText());
		Comments savedComment = registerCommentService.save(comment);
		System.out.println(savedComment);
	}

}
