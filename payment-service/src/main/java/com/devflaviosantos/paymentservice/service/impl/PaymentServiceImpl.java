package com.devflaviosantos.paymentservice.service.impl;

import org.springframework.stereotype.Service;

import com.devflaviosantos.paymentservice.model.Payment;
import com.devflaviosantos.paymentservice.service.PaymentService;

import lombok.extern.log4j.Log4j2;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService{

	@Override
	public void sendPayment(Payment payment) {
		// TODO Auto-generated method stub
		log.info("PAYMENT_SERVICE_IMPL >>> Recebi o Pagamento {}", payment);
		
	}

}
