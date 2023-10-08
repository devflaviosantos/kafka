package com.devflaviosantos.jsonconsumer.listerner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.devflaviosantos.jsonconsumer.model.Payment;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import static java.lang.Thread.sleep;

@RequiredArgsConstructor
@Log4j2
@Component
public class JsonListener {
	
	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
	public void antiFraud(@Payload Payment payment) {
		log.info("Recebi o pagamento {}", payment.toString());
		sleep(2000);
		log.info("Validando fraude >>>");
		sleep(2000);
		
		log.info("Compra aprovada >>>");
		sleep(3000);
	}
	
	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
	public void pdfGenerator(@Payload Payment payment) {
		
		log.info("Gerando PDF >>>");
		sleep(2000);
				
	}
	
	@SneakyThrows
	@KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
	public void sendEmail(@Payload Payment payment) {
		sleep(3000);
		log.info("Enviando Email de confirmaçao >>>");
		//sleep(2000);
				
	}
	
	
	
}
