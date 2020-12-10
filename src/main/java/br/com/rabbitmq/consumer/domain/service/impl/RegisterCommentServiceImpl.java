package br.com.rabbitmq.consumer.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.repository.CommentRepository;
import br.com.rabbitmq.consumer.domain.service.RegisterCommentsGenericService;
import reactor.core.publisher.Mono;

@Service
public class RegisterCommentServiceImpl implements RegisterCommentsGenericService {

	@Autowired
	private CommentRepository commentRepository;

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public Mono<Comments> save(Comments comment) {
		Mono<Comments> savedComment = commentRepository.save(comment);
		return savedComment;
	}

}
