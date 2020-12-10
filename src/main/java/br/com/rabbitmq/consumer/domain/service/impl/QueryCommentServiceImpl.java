package br.com.rabbitmq.consumer.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.repository.CommentRepository;
import br.com.rabbitmq.consumer.domain.service.QueryCommentService;
import reactor.core.publisher.Flux;

@Service
public class QueryCommentServiceImpl implements QueryCommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@SuppressWarnings("unchecked")
	@Override
	public Flux<Comments> comments() {
		Flux<Comments> comments = commentRepository.findAll();
		return comments;
	}
}
