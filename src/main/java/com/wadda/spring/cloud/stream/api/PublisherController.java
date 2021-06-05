package com.wadda.spring.cloud.stream.api;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wadda.spring.cloud.stream.domain.Book;

@RestController
@RequestMapping
public class PublisherController {
	
	@Autowired
	private MessageChannel output;
	
	@PostMapping("/publish")
	public Book publishEvent(@RequestBody Book book) {
		output.send(MessageBuilder.withPayload(book).build());
		return book;
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		
		return "Hello Dileepa Waduge";
	}

}
