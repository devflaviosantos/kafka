package com.devflaviosantos.paymentservice.service.impl;

import java.io.Serializable;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.devflaviosantos.paymentservice.model.Payment;
import com.devflaviosantos.paymentservice.service.PaymentService;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Service
public class PaymentServiceImpl implements PaymentService{
	
	
	private final KafkaTemplate<String, Serializable> kafkaTemplate;

	@SneakyThrows
	@Override
	public void sendPayment(Payment payment) {
		// TODO Auto-generated method stub
		log.info("PAYMENT_SERVICE_IMPL >>> Recebi o Pagamento {}", payment);
		Thread.sleep(1000);
		
		log.info("Enviando pagamento....");
		kafkaTemplate.send("payment-topic", payment);
		
		
	}

}
