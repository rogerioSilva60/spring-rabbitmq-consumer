package br.com.rabbitmq.consumer.domain.service;

import java.util.List;

import br.com.rabbitmq.consumer.domain.entity.Comments;

public interface QueryCommentService {

	List<Comments> comments();
}
