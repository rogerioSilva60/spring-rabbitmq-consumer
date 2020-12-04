package br.com.rabbitmq.consumer.domain.entity;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Comments implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String id;
	private String text;
	
	
	@Override
	public String toString() {
		return "Comments [id=" + id + ", text=" + text + "]";
	}
	
	
}
