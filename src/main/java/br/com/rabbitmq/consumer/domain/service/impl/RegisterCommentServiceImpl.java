package br.com.rabbitmq.consumer.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.repository.CommentRepository;
import br.com.rabbitmq.consumer.domain.service.RegisterCommentService;

@Service
public class RegisterCommentServiceImpl implements RegisterCommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Transactional
	@Override
	public Comments save(Comments comment) {
		Comments savedComment = commentRepository.save(comment);
		return savedComment;
	}

}
