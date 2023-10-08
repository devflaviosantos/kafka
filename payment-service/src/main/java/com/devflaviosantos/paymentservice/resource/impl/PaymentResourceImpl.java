package com.devflaviosantos.paymentservice.resource.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devflaviosantos.paymentservice.model.Payment;
import com.devflaviosantos.paymentservice.resource.PaymentResource;
import com.devflaviosantos.paymentservice.service.PaymentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource{

	private final PaymentService paymentService;
	
	@Override
	public ResponseEntity<PaymentResource> payment(Payment payment) {
		// TODO Auto-generated method stub
		paymentService.sendPayment(payment);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}

}
