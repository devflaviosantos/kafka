package com.devflaviosantos.stproducer.services;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class StringProducerService {
	

	private final KafkaTemplate<String, String> kafkaTemplate;

	
	public void sendMessage(String message) {
		kafkaTemplate.send("str-topic", message);
		kafkaTemplate.send("str-topics", message);
		
//		.addCallback(
//				sucess -> {
//					
//					if (sucess != null) {
//						log.info("Send message with sucess {}", message);
//						log.info("Partition {}, Offset {}", 
//								sucess.getRecordMetadata().partition(),
//								sucess.getRecordMetadata().offset());
//					}
//					
//				}, 
//				error -> log.info("Error send message")
//	  );
	}
	
}
