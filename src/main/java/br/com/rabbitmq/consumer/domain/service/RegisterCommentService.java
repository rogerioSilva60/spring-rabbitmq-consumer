package br.com.rabbitmq.consumer.domain.service;

import br.com.rabbitmq.consumer.domain.entity.Comments;

public interface RegisterCommentService {

	Comments save(Comments comment);
	
}
