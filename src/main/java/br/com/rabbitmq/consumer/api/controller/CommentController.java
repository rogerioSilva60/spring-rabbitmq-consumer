package br.com.rabbitmq.consumer.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rabbitmq.consumer.api.dto.CommentDto;
import br.com.rabbitmq.consumer.domain.entity.Comments;
import br.com.rabbitmq.consumer.domain.service.QueryCommentService;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("api/v1/comments")
public class CommentController {

	@Autowired
	private QueryCommentService queryCommentService;
	
	@GetMapping
	public ResponseEntity<Flux<CommentDto>> findAll() {
		Flux<Comments> comments = queryCommentService.comments();
		Flux<CommentDto> commentDtoFlux = comments.map(c -> new CommentDto(c))
				.collectList()
				.flatMapMany(Flux::fromIterable);		
		return ResponseEntity.ok(commentDtoFlux);
	}
	
}
