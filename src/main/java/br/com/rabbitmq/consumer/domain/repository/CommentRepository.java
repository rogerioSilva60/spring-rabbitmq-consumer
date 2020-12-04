package br.com.rabbitmq.consumer.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.rabbitmq.consumer.domain.entity.Comments;

public interface CommentRepository extends MongoRepository<Comments, String>{

}
