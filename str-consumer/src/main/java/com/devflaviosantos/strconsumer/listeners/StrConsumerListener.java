package com.devflaviosantos.strconsumer.listeners;

import org.springframework.stereotype.Component;

import com.devflaviosantos.strconsumer.costum.StrConsumerCustomListener;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Component
public class StrConsumerListener {

	
	@StrConsumerCustomListener(groupId = "group-1")
	public void created(String message) {
		log.info("CREATE ::: Receive message {}", message);
	}
	
	@StrConsumerCustomListener(groupId = "group-1")
	public void Log(String message) {
		log.info("LOG ::: Receive message {}", message);
	}
	
	@StrConsumerCustomListener(groupId = "group-2")
	public void History(String message) {
		log.info("History ::: Receive message {}", message);
	}
	
}
