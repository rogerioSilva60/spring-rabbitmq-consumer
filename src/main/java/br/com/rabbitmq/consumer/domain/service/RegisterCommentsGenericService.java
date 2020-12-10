package br.com.rabbitmq.consumer.domain.service;

import br.com.rabbitmq.consumer.domain.entity.Comments;

public interface RegisterCommentsGenericService {

	<T> T save(Comments comments);
	
}
