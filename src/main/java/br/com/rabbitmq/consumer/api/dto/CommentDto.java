package br.com.rabbitmq.consumer.api.dto;

import br.com.rabbitmq.consumer.domain.entity.Comments;
import lombok.Data;

@Data
public class CommentDto {

	private String id;
	private String text;
	
	public CommentDto() {}
	public CommentDto(Comments c) {
		id = c.getId();
		text = c.getText();
	}
	
}
