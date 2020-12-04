package br.com.rabbitmq.consumer.domain.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.repository.CommentRepository;
import br.com.rabbitmq.consumer.domain.service.QueryCommentService;

@Service
public class QueryCommentServiceImpl implements QueryCommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public List<Comments> comments() {
		List<Comments> comments = commentRepository.findAll();
		return comments;
	}
}
