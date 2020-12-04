package br.com.rabbitmq.consumer.api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabbitmq.consumer.api.dto.CommentDto;
import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.service.QueryCommentService;

@RestController
@RequestMapping("api/v1/comments")
public class CommentController {

	@Autowired
	private QueryCommentService queryCommentService;
	
	@GetMapping
	public ResponseEntity<List<CommentDto>> findAll() {
		List<Comments> comments = queryCommentService.comments();
		
		List<CommentDto> commentsDto = comments.stream()
			.map(c -> new CommentDto(c))
			.collect(Collectors.toList());
		return ResponseEntity.ok(commentsDto);
	}
	
}
