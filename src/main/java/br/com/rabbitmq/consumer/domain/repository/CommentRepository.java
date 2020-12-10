package br.com.rabbitmq.consumer.domain.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import br.com.rabbitmq.consumer.domain.entity.Comments;

public interface CommentRepository extends ReactiveMongoRepository<Comments, String>{
	
}
